package com.schooldevops.kotlin.basicrest.service

import com.schooldevops.kotlin.basicrest.exceptions.*
import jdk.jshell.spi.ExecutionControl.NotImplementedException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException

@Service
class ExceptionTestService {

    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = LoggerFactory.getLogger(javaClass.enclosingClass)
    }

    fun throwExceptionByOption(option: String): String {
        if (option == "NotImpl") {
            throw CustomNotImplementedException("메소드가 구현되지 않았습니다.")
        }

        return "Success"
    }

    @Throws(CustomCheckedException::class)
    fun throwExceptionByOption2(option: String): String {
        throw CustomCheckedException("체크 예외", null)
    }

    fun throwExceptionStatus(option: String): String {
        throw CustomResponseStatusException("체크 예외")
    }

    fun throwExceptionByOption3(option: String): String {
        if (option == "NotImpl") {
            throw NotImplementedException("구현되지 않음")
        } else if (option == "IllegalArgs"){
            throw IllegalArgumentException("잘못된 아규먼트")
        }
        return "OK"
    }

    fun throwExceptionByOption4(option: String): String {
        if (option == "C01") {
            throw GlobalCustomException01("C01-Global Exception:---------01")
        } else if (option == "C02") {
            throw GlobalCustomException02("C02-Global Exception:---------02")
        } else {
            throw RuntimeException("Other Exception")
        }
    }
}