//package com.example.jpademo
//
//import org.junit.Assert
//import org.junit.Test
//import java.text.DateFormat
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
//import org.junit.runner.RunWith
//import org.springframework.boot.test.SpringApplicationConfiguration
//import java.util.*
//
//
//@RunWith(SpringJUnit4ClassRunner::class)
//@SpringApplicationConfiguration(JpademoApplication::class)
//class UserRepositoryTests {
//
//    @Autowired
//    private val userRepository: UserRepository? = null
//
//    @Test
//    @Throws(Exception::class)
//    fun test() {
//        val date = Date()
//        val dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG)
//        val formattedDate = dateFormat.format(date)
//
//        userRepository.save(User("aa1", "aa@126.com", "aa", "aa123456",   formattedDate))
//        userRepository.save(User("bb2", "bb@126.com", "bb", "bb123456", formattedDate))
//        userRepository.save(User("cc3", "cc@126.com", "cc", "cc123456", formattedDate))
//
//        Assert.assertEquals(9, userRepository.findAll().size)
//        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").nickName)
//        userRepository.delete(userRepository.findByUserName("aa1"))
//    }
//
//}