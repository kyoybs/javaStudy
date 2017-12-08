package com.example.demojpa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemojpaApplication{

    @Autowired
    private var userRepository: UserRepository?=null

    @RequestMapping("/")
    fun hello():String{

        if(userRepository == null)
            return "null"

        //kotlin 转非空类型
        val ur = userRepository!!

        // 创建10条记录
        ur.save(User("AAA", 10))
        ur.save(User("BBB", 20))
        ur.save(User("CCC", 30))
        ur.save(User("DDD", 40))
        ur.save(User("EEE", 50))
        ur.save(User("FFF", 60))
        ur.save(User("GGG", 70))
        ur.save(User("HHH", 80))
        ur.save(User("III", 90))
        ur.save(User("JJJ", 100))

        return "Hello KL.10"
    }


}

fun main(args: Array<String>) {
    SpringApplication.run(DemojpaApplication::class.java, *args)
}
