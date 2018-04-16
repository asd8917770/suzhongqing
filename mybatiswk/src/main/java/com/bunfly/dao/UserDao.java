package com.bunfly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bunfly.entity.User;
/**
 * 数据库操作UserDao层
 * */
public interface UserDao {
	//查询
	User getUserById(Integer id);
	//增加
	int insertUser(@Param("username")String username,@Param("password")String password,@Param("sex")String sex);
	//boolean insert(User user);
	//删除
	int delete(Integer id);
	//修改
	boolean update(User user);
	//查询所有
	List<User> findAll();
	List<User> getLikeZhang(@Param("username") String username);
}
