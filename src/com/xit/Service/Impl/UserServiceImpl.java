package com.xit.Service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xit.Service.UserService;
import com.xit.beans.User;
import com.xit.dao.UserDao;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;


	@Override
	public User login(User user) {
		return userDao.selectByUserAndPassword(user);
	}

	@Override
	public Boolean addUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public List<User> getUsersByPage(Integer pageNo, Integer pageSize) {
		Integer page = (pageNo - 1) * pageSize;
		return userDao.selectUserByPage(page, pageSize);
	}
	@Override
	public int CountUsers() {
		return userDao.countUsers();
	}
	
	
}
