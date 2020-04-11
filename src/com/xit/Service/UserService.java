package com.xit.Service;


import java.util.List;

import com.xit.beans.User;

public interface UserService {
	
	User login(User user);

	Boolean addUser(User user);

	List<User> getUsersByPage(Integer pageNo, Integer pagesize);

	int CountUsers();
}
