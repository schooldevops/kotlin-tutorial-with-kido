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