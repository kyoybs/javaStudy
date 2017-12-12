package com.example.mybatisdemo

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select


@Mapper
interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    fun findByName(@Param("name") name: String): List<User>

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    fun insert(@Param("name") name: String, @Param("age") age: Int?): Int

}
