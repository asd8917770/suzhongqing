package com.bunfly.dao;

import java.util.List;

import com.bunfly.entity.Student;


public interface Students {
	Student getUserById(Integer id);
	List<Student> getAllstudent();
}
