package com.example.jpademo

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByUserName (userName:String):User

    fun findByUserNameOrEmail (username:String, email:String ):User
}