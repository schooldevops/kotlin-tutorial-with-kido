package com.schooldevops.kotlin.basicrest.exceptions

class CustomCheckedException(message: String? = null, cause: Throwable? = null): Exception(message, cause) {
}