package com.schooldevops.kotlin.basicrest.filters

import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.http.HttpServletRequest
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(2)
class LoggingFilter: Filter {

    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = LoggerFactory.getLogger(javaClass.enclosingClass)
    }

    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val req = request as HttpServletRequest
        logger.info("LoggingFilter --- Method: ${req.method} > URI: ${req.requestURI}")

        chain!!.doFilter(request, response)
        // Controller 처리이후에 들어오는 위치

        logger.info("After Controller Process.")

    }


}