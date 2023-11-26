package com.schooldevops.kotlin.basicrest.interceptors

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView

@Component
@Qualifier("customInterceptor")
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