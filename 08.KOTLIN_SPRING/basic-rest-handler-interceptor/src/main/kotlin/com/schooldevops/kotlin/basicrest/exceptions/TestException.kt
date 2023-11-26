package com.schooldevops.kotlin.basicrest.exceptions

class TestException: RuntimeException {
    constructor()
    constructor(message: String)
    constructor(message: String, throwable: Throwable)
    constructor(throwable: Throwable)
}