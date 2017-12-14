package com.example.mybatisdemo

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.annotation.Rollback
import org.springframework.beans.factory.annotation.Autowired



@RunWith(SpringRunner::class)
@SpringBootTest
class MybatisdemoApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Autowired
	private val userMapper: UserMapper? = null

	@Test
	@Rollback
	@Throws(Exception::class)
	fun findByName() {
		userMapper!!.insert("AAA", 20)
		val u = userMapper!!.findByName2("AAA")

		System.out.println("OK OK")
		Assert.assertEquals(20, u[0].age)
	}
}
