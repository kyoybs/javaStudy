package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@EnableAutoConfiguration(exclude= arrayOf(DataSourceAutoConfiguration::class))
class DemoApplication {

    @GetMapping("/")
    fun hello() = "hello 1"
}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

