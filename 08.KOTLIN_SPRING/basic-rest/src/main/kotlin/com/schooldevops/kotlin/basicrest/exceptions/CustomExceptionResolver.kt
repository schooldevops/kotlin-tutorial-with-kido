package com.schooldevops.kotlin.basicrest.exceptions

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import jdk.jshell.spi.ExecutionControl.NotImplementedException
import org.springframework.stereotype.Component
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver
import java.lang.Exception

@Component
class CustomExceptionResolver: AbstractHandlerExceptionResolver() {
    override fun doResolveException(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any?,
        ex: Exception
    ): ModelAndView? {
        return when(ex) {
            is IllegalArgumentException -> {
                logger.info("Custom Exception Resolver ----> IllegalArgumentException" )
                response.sendError(HttpServletResponse.SC_CONFLICT)
                ModelAndView();
            }

            is NotImplementedException -> {
                logger.info("Custom Exception Resolver ----> NotImplementedException" )
                response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED)
                ModelAndView();
            }

            else -> {
                ModelAndView()
            }
        }
    }
}