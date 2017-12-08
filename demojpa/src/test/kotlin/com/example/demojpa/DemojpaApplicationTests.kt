package com.example.demojpa

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired

@RunWith(SpringRunner::class)
@SpringBootTest
class DemojpaApplicationTests {

	@Autowired
	private var userRepository: UserRepository?=null

	@Throws(Exception::class)
	fun test() {

		if(userRepository == null)
			return

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

		// 测试findAll, 查询所有记录
		Assert.assertEquals(10, ur.findAll().size)

		// 测试findByName, 查询姓名为FFF的User
		Assert.assertEquals(60, ur.findByName("FFF").age)

		// 测试findUser, 查询姓名为FFF的User
		Assert.assertEquals(60, ur.findUser("FFF").age )

		// 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
		Assert.assertEquals("FFF", ur.findByNameAndAge("FFF", 60).name)

		// 测试删除姓名为AAA的User
		ur.delete(ur.findByName("AAA"))

		// 测试findAll, 查询所有记录, 验证上面的删除是否成功
		Assert.assertEquals(9, ur.findAll().size)

	}


	@Test
	fun contextLoads() {
	}

}
