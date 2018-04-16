package com.test.userdaotest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.bunfly.dao.UserDao;
import com.bunfly.entity.User;

public class UserDaoTest {
	//引入log4j日志	
	Logger log = Logger.getLogger(UserDaoTest.class);
	
	private SqlSessionFactory factory = null;
	public SqlSessionFactory getSessionFactory() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		if (factory==null) {
			synchronized (UserDaoTest.class) {
				return new SqlSessionFactoryBuilder().build(in);
			}
		}
		return factory;
	}
	public SqlSession getSession() throws IOException {
		return this.getSessionFactory().openSession();
		}
	@Test
	public void insert() throws IOException {
		SqlSession session = this.getSessionFactory().openSession();
		//得到映射文件
		UserDao dao = session.getMapper(UserDao.class);
		//增加
		User user = new User("四大", "123", "男");
		/**第一种方式*/
//		boolean flag = dao.insert(user);
//		System.out.println(flag);
//		System.out.println(user);
		/**第二种方式*/
		int row = session.insert("com.bunfly.dao.UserDao.insert", user);
		System.out.println("insert："+row);
		System.out.println(user);
		//提交查询结果
		session.commit();
		//关闭session
		session.close();
	}
	@Test
	public void getUserById() throws IOException {	
		SqlSession session = this.getSessionFactory().openSession();	
		UserDao dao = session.getMapper(UserDao.class);		
		User user = dao.getUserById(2);
		System.out.println(user);
		session.commit();
		session.close();
	}
	@Test
	public void getLikeZhang() throws IOException {
		//获得Sqlsession 
		SqlSession session = this.getSession();
		//得到映射文件
		UserDao udm = session.getMapper(UserDao.class);			
		List<User> mapUser = udm.getLikeZhang("小");
		itreaList(mapUser);
		//提交查询结果
		session.commit();
		//关闭session
		session.close();
	}
	public <T>void itreaList(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}
}