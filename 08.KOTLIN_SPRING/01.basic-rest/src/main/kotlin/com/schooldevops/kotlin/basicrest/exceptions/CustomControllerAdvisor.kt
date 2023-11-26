package com.schooldevops.kotlin.basicrest.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.Objects

@ControllerAdvice
class CustomControllerAdvisor: ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [GlobalCustomException01::class, GlobalCustomException02::class, Exception::class])
    fun handleGlobalException(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        return when (ex) {
            is GlobalCustomException01 -> {
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.message)
            }

            is GlobalCustomException02 -> {
                ResponseEntity.status(HttpStatus.CONFLICT).body(ex.message)
            }

            else -> {
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("처리할수 없는 컨텐츠입니다.")
            }
        }
    }
}