//参照 http://www.ityouknow.com/springboot/2016/02/03/springboot(%E4%BA%8C)-web%E7%BB%BC%E5%90%88%E5%BC%80%E5%8F%91.html

package com.example.jpademo


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.boot.SpringApplication

@SpringBootApplication
@RestController
class JpademoApplication{

    @RequestMapping("/")
    fun hello():String{
        return "Hello"
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(JpademoApplication::class.java, *args)
}
