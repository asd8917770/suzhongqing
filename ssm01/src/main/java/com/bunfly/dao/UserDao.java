package com.bunfly.dao;

import org.springframework.stereotype.Repository;

import com.bunfly.entity.User;

@Repository
public interface UserDao {

	User getUserById(Integer id);
}
