package com.example.demojpa

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class User (
    @Column(nullable = false)
    var name: String ,
    @Column(nullable = false)
    var age: Int
){
    @Id
    @GeneratedValue
    var id: Long =0
}