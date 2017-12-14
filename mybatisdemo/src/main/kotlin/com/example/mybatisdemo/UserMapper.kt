package com.example.mybatisdemo

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.session.SqlSession
import org.springframework.beans.factory.annotation.Autowired

object Sqls{
    const val name2 = """SELECT * FROM USER
WHERE NAME = #{name}"""
}

@Mapper
interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    fun findByName(@Param("name") name: String): List<User>

    @Select(Sqls.name2)
    fun findByName2(@Param("name") name: String): List<User>

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    fun insert(@Param("name") name: String, @Param("age") age: Int?): Int

}

