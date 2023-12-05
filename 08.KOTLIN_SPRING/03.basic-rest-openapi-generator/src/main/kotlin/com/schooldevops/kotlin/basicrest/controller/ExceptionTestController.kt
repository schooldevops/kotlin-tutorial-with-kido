package com.schooldevops.kotlin.basicrest.controller

import com.schooldevops.kotlin.basicrest.exceptions.CustomNotImplementedException
import com.schooldevops.kotlin.basicrest.service.ExceptionTestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/except")
class ExceptionTestController {

    @Autowired
    lateinit var exceptionTestService: ExceptionTestService

    @ExceptionHandler(value = [CustomNotImplementedException::class])
    fun notImplExceptionHandler(ex: Exception) {
        println("--------[Start Handle Exception]-------")
        println(ex)
        println("--------[End Handle Exception]-------")

    }


    @GetMapping("/ctl")
    fun controllerLevelException(): String {
        return exceptionTestService.throwExceptionByOption("NotImpl")
    }

    @GetMapping("/checked")
    fun controllerLevelChecked(): String{
        return exceptionTestService.throwExceptionByOption2("?")
    }

    @GetMapping("/except-resolver")
    fun exceptResolver(): String{
        return exceptionTestService.throwExceptionStatus("?")
    }

    @GetMapping("/excep-resolve/{expcode}")
    fun controllerLevelException2(@PathVariable expcode: String): String{
        return exceptionTestService.throwExceptionByOption3(expcode)
    }

    @GetMapping("/global/{expcode}")
    fun throwExceptionByOption4(@PathVariable expcode: String): String{
        return exceptionTestService.throwExceptionByOption4(expcode)
    }
}