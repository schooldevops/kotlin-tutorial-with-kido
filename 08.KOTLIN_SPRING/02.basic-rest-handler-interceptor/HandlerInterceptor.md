# Handler Interceptor 이용하기

- SpringBoot Handler Interceptor는 request가 들어오면 핸들러로 요청을 보내기 전에 중간에 Interceptor를 수행한다. 
- Interceptor가 처리되고 나면 요청을 Controller로 전달된다. 
- Controller가 처리가 완료되면 이후에 Interceptor로 다시 응답을 반환하게 된다.

## HandlerInterceptor 구현하기. 

- CustomInterceptor.kt 파일을 생성하고 다음과 같이 작성한다. 

```kt
package com.schooldevops.kotlin.basicrest.interceptors

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception

@Component
class CustomInterceptor: HandlerInterceptor {

    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = LoggerFactory.getLogger(javaClass.enclosingClass)
    }

    /**
     * 핸들러 처리를 위해서 가장 먼저 수행된다.
     * true이면 컨트롤러에 요청을 전달하고, false이면 더이상 요청을 컨트롤러로 전달하지 않는다.
     */
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        super.preHandle(request, response, handler)
        logger.info("Pre Handle 수행 ------------->> ")
        return true  // <-- true이므로 요청을 컨트롤러에 전달한다.
    }

    /**
     * 컨트롤러 처리가 완료되고 나면 postHandle로 들어온다.
     */
    override fun postHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        modelAndView: ModelAndView?
    ) {
        super.postHandle(request, response, handler, modelAndView)
        logger.info("Post Handle 수행 -------------------------------")
    }

    /**
     * 뷰 렌더링까지 완료된 이후에 수행된다.
     */
    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?
    ) {
        super.afterCompletion(request, response, handler, ex)
        logger.info("After Completion ---------------------- 뷰 렌더링까지 완료휴 ")
    }
}
```

- preHandle는 인터셉터가 들어오면 수행된다. 
  - true인경우 다음 핸들러로 이동
  - false인경우 요청을 전달하지 않고 그대로 종료 
- postHandle 핸들러 처리가 완료되고 나면 수행한다. 
- afterCompletion은 모든 뷰 처리까지 완료되고 나면 수행된다. 

## WebMvcConfig 설정하기

- 이제 WebMvc 처리에 대한 설정을 지정한다. 
- WebMvcConfigurer 인터페이를 구현하고 Interceptor를 등록한다. 
- WebMvcConfig.kt 파일을 다음과 같이 작성한다. 

```kt
package com.schooldevops.kotlin.basicrest.config

import com.schooldevops.kotlin.basicrest.interceptors.CustomInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMvcConfig(private val customInterceptor: CustomInterceptor) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(customInterceptor).addPathPatterns("/v1/users/**")
    }
}
```

- 우리는 registry에 addInterceptor를 통해서 customInterceptor를 등록한다. 
- 이때 addPathPatterns 에 등록된 uri패턴이 들어오면, 인터셉터가 동작하게 된다. 

## 테스트하기

- 이제 다음과 같이 요청을 보내보자. 

```kt
curl -X http://localhost:8080/v1/users/1
```

- 위 처리시 preHandle 메소드가 동작한다. 
- 이후 Controller 메소드가 수행되고, 
- 정상으로 처리된 경우라면 postHandle가 수행되고 난 후 afterComplete 메소드가 수행된다. 
- 그러나 비정상 처리된 경우 예외가 발생하면 바로 afterComplete 메소드가 수행될 것이다. 

## 여러 핸들러 인터셉트 걸어주기. 

### 핸들러 인터셉터 생성 

- SecondCustomInterceptor.kt 파일을 다음과 같이 생성하자. 

```kt
package com.schooldevops.kotlin.basicrest.interceptors

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView

@Component
@Qualifier("secondCustomInteceptor")
class SecondCustomInteceptor: HandlerInterceptor {
    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = LoggerFactory.getLogger(javaClass.enclosingClass)
    }

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        logger.info("SecondCustomInteceptor Pre Handle 수행 ------------->> ")
        return super.preHandle(request, response, handler)
    }

    override fun postHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        modelAndView: ModelAndView?
    ) {
        logger.info("SecondCustomInteceptor Post Handle 수행 ------------->> ")
        super.postHandle(request, response, handler, modelAndView)
    }

    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?
    ) {
        logger.info("SecondCustomInteceptor afterCompletion 수행 ------------->> ")
        super.afterCompletion(request, response, handler, ex)
    }
}
```

### 핸들러 인터셉터 등록 

- WebMvcConfig.kt 파일을 다음과 같이 수정한다. 

```kt
package com.schooldevops.kotlin.basicrest.config

import com.schooldevops.kotlin.basicrest.interceptors.CustomInterceptor
import com.schooldevops.kotlin.basicrest.interceptors.SecondCustomInteceptor
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMvcConfig(
    @Qualifier("customInterceptor") private val customInterceptor: CustomInterceptor,
    @Qualifier("secondCustomInteceptor") private val secondCustomInterceptor: SecondCustomInteceptor
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(customInterceptor).addPathPatterns("/v1/users/**")
        registry.addInterceptor(secondCustomInterceptor).addPathPatterns("/v1/users/**")
    }
}
```

- registry 에 등록되는 순서대로 Interceptor가 순차적으로 수행된다. 
- 위치를 앞/뒤 로 바꿔보면 바뀐 순서대로 수행될 것이다. 
