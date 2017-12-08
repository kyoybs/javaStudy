package com.example.demojpa

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param


interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User
    fun findByNameAndAge(name: String, age: Int?): User
    @Query("from User u where u.name=:name")
    fun findUser(@Param("name") name: String): User
}
