package com.bunfly.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bunfly.dao.UserDao;
import com.bunfly.entity.User;
import com.bunfly.service.UserService;

@Service
public class UserServiceImp implements UserService {

	private UserDao userDao;
	
	
	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}


	public UserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
