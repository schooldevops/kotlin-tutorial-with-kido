package com.schooldevops.kotlin.basicrest.repository

import com.schooldevops.kotlin.basicrest.vo.User
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Qualifier("mySQLUserRepository")
@Repository
class MySQLUserRepository: UserRepository {
    override fun createUser(user: User): User {
        TODO("Not yet implemented")
    }

    override fun modifyUserById(user: User): User {
        TODO("Not yet implemented")
    }

    override fun getUserById(userId: String): User {
        TODO("Not yet implemented")
    }

    override fun deleteUserById(userId: String): Boolean {
        TODO("Not yet implemented")
    }
}