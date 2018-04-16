package com.test.StudentTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.bunfly.dao.Classess;
import com.bunfly.dao.Students;
import com.bunfly.dao.Teachers;
import com.bunfly.entity.Classes;
import com.bunfly.entity.Student;
import com.bunfly.entity.Teacher;

public class StudentTest {
	//引入log4日志	
	Logger log = Logger.getLogger(StudentTest.class);
	private SqlSessionFactory factory =null;
	public SqlSessionFactory getSessionFactory() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		if (factory==null) {
			synchronized (StudentTest.class) {
				return new SqlSessionFactoryBuilder().build(in);
			}
		}
		return factory;
	}
	public SqlSession getSession() throws IOException {
		return this.getSessionFactory().openSession();
		}
	@Test
	public void getUserById() throws IOException {	
		SqlSession session = this.getSessionFactory().openSession();	
		Students dao = session.getMapper(Students.class);		
		Student user = dao.getUserById(2);
		System.out.println(user);
		session.commit();
		session.close();
	}
	@Test
	public void getClass2() throws IOException{
		SqlSession session = this.getSessionFactory().openSession();
		Classess dao = session.getMapper(Classess.class);
		Classes id = dao.getClass(1);
		System.out.println(id);
		session.commit();
		session.close();
	}
	@Test
	public void getTeacher() throws IOException{
		SqlSession session = this.getSessionFactory().openSession();
		Teachers dao = session.getMapper(Teachers.class);
		Teacher id = dao.getTeacher(1);
		System.out.println(id);
		session.commit();
		session.close();
	}
	@Test
	public void getAllstudent() throws IOException{
		SqlSession session = this.getSessionFactory().openSession();
		Students dao = session.getMapper(Students.class);
		List<Student> id= dao.getAllstudent();
		System.out.println(id);
		session.commit();
		session.close();
	}
}
