package com.schooldevops.kotlin.basicrest.controller

import com.schooldevops.kotlin.basicrest.api.GreetApi
import com.schooldevops.kotlin.basicrest.model.GreetGet200Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class GeetingController: GreetApi {
    override fun greetGet(): ResponseEntity<GreetGet200Response> {

        return ResponseEntity.ok(GreetGet200Response().message("Hello Greeting"))
    }
}