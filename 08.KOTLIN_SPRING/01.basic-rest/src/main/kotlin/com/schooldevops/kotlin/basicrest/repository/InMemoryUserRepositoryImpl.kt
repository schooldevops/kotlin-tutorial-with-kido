package com.schooldevops.kotlin.basicrest.repository

import com.schooldevops.kotlin.basicrest.vo.User
import org.springframework.stereotype.Repository
import java.lang.IllegalArgumentException
import java.util.concurrent.atomic.AtomicLong

@Repository
class InMemoryUserRepositoryImpl: UserRepository {

    /**
     * 사용자 정보 맵을 생성한다.
     */
    val userInfoMap: MutableMap<String, User> = mutableMapOf()
    var sequenceId: AtomicLong = AtomicLong(0)

    override fun createUser(user: User): User {
        if (user.userId != null) throw IllegalArgumentException("userId must be null when you create User info.")

        val newUser = user.copy(userId = sequenceId.addAndGet(1).toString())
        userInfoMap.put(newUser.userId.toString(), newUser);
        
        return newUser
    }

    override fun modifyUserById(user: User): User {
        if (user.userId == null) throw IllegalArgumentException("userId must not be null. when you update User.")

        val findedUserInfo = getUserById(user.userId!!)

        val userName = user.userName ?: findedUserInfo.userName
        val age = user.age ?: findedUserInfo.age
        val phone = user.phone ?: findedUserInfo.phone

        val updatedUser = User(user.userId, userName, age, phone)
        userInfoMap.put(updatedUser.userId!!, updatedUser)

        return updatedUser
    }

    override fun getUserById(userId: String): User {
        val userInfo = userInfoMap.get(userId)
        if (userInfo == null) {
            throw ClassNotFoundException("userInfo not found Exception.")
        }

        return userInfo

    }

    override fun deleteUserById(userId: String): Boolean {
        val remove = userInfoMap.remove(userId)
        if (remove != null) return true
        return false
    }
}