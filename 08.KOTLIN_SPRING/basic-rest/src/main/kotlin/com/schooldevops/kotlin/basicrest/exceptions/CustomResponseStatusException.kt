package com.schooldevops.kotlin.basicrest.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class CustomResponseStatusException: RuntimeException {
    constructor(): super()
    constructor(message: String, throwable: Throwable): super(message, throwable)
    constructor(message: String): super(message)
    constructor(throwable: Throwable): super(throwable)
}