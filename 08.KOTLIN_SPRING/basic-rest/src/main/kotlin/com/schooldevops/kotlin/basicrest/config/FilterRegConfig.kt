package com.schooldevops.kotlin.basicrest.config

import com.schooldevops.kotlin.basicrest.filters.Logging2Filter
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FilterRegConfig {

    @Bean
    fun logging2FilterBean(): FilterRegistrationBean<Logging2Filter> {
        var filterReg = FilterRegistrationBean<Logging2Filter>()
        filterReg.filter = Logging2Filter()
        filterReg.addUrlPatterns("/v1/users", "/v1/users/*")
        filterReg.order = 3

        return filterReg
    }
}