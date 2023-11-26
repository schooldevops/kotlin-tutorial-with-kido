package com.schooldevops.kotlin.basicrest.repository

import com.schooldevops.kotlin.basicrest.vo.User

interface UserRepository {
    /**
     * 사용자 정보를 생성한다.
     */
    fun createUser(user: User): User

    /**
     * 사용자 정보를 수정한다.
     * user객체 내부의 userId 값을 이용하여 수정하게 된다.
     */
    fun modifyUserById(user: User): User

    /**
     * 사용자 정보를 userId로 조회한다.
     */
    fun getUserById(userId: String): User

    /**
     * 사용자 정보를 userId로 삭제한다.
     */
    fun deleteUserById(userId: String): Boolean
}