package com.example.jpademo

import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class User( userName:String, password:String, email:String, nickName:String, regTime:String) : Serializable {

    @Id
    @GeneratedValue
    var id: Long=0

    @Column(nullable = false, unique = true)
    val userName: String =userName

    @Column(nullable = false)
    val passWord = password

    @Column(nullable = false, unique = true)
    val email=email

    @Column(nullable = true, unique = true)
    val nickName=nickName

    @Column(nullable = false)
    val regTime=regTime

    companion object {
        private const val serialVersionUID = 1L
    }

}