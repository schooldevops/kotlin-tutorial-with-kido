package com.schooldevops.kotlin.basicrest.service

import com.schooldevops.kotlin.basicrest.repository.UserRepository
import com.schooldevops.kotlin.basicrest.vo.User
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired @Qualifier("mySQLUserRepository") val repository: UserRepository) {

    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = LoggerFactory.getLogger(javaClass.enclosingClass)
    }

    fun createUser(user: User): User {
        return repository.createUser(user);
    }

    fun updateUser(user: User): Boolean {
        val modifiedUser = repository.modifyUserById(user)
        if (modifiedUser != null) return true;
        return false;
    }

    fun getUserById(userId: String): User = repository.getUserById(userId)

    fun deleteUserById(userId: String): Boolean = repository.deleteUserById(userId)
}