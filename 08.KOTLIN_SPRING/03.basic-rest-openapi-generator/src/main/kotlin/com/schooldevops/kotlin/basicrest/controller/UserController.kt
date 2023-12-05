package com.schooldevops.kotlin.basicrest.controller

import com.schooldevops.kotlin.basicrest.service.UserService
import com.schooldevops.kotlin.basicrest.vo.User
import jakarta.servlet.http.HttpServletRequest
import org.slf4j.LoggerFactory.getLogger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserController(@Autowired val userService: UserService) {

    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = getLogger(javaClass.enclosingClass)
    }

    @PostMapping("/v1/users")
    fun createUser(@RequestBody user: User, request: HttpServletRequest): ResponseEntity<User?> {

        val headerNames = request.headerNames

        while (headerNames.hasMoreElements()) {
            val nextElement = headerNames.nextElement()
            if (nextElement != null && nextElement.lowercase() == ("content-type")) {

            }
        }

        // TODO
        logger.info("CreateUser: {}", user)
        return ResponseEntity.ok(userService.createUser(user))
    }

    @PutMapping("/v1/users")
    fun updateUser(@RequestBody user: User): ResponseEntity<Boolean> {
        // TODO
        logger.info("updateUser: {}", user)
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @GetMapping("/v1/users/{userId}")
    fun getUserById(@PathVariable userId: String): ResponseEntity<User?> {
        // TODO
        logger.info("getUserById: {}", userId)
        return ResponseEntity.ok(userService.getUserById(userId));
    }

    @DeleteMapping("/v1/users/{userId}")
    fun deleteUserById(@PathVariable userId: String): ResponseEntity<Boolean> {
        // TODO
        logger.info("deleteUserById: {}", userId)
        return ResponseEntity.ok(userService.deleteUserById(userId));
    }
}