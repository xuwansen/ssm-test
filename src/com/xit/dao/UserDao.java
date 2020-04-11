package com.xit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xit.beans.User;

public interface UserDao {
	public List<User> selectAllUser();
	public User selectByUserAndPassword(User user);
	public Boolean insertUser(User user);
	public int countUsers();
	public List<User> selectUserByPage(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
}
