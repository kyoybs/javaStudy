package com.example.jpademo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class JpademoApplication

fun main(args: Array<String>) {
    SpringApplication.run(JpademoApplication::class.java, *args)
}
