package com.xit.Service;

import java.util.List;

import com.xit.beans.Application;

public interface ApplicationService {

	void addApplication(Application application);

	List<Application> getApplications(int userId);

	int CountApplications();

	List<Application> getApplicationsByPage(Integer pageNo, Integer pagesize);

	void remove(Integer id);

	List<Application> getApplicationsByClubAndPage(Integer pageNo, Integer pagesize, Integer clubId);

	int CountApplicationsByClub(Integer clubId);

	void alterApplicationById(Integer id, String status);

	void addApplicationByCreateClub(Application application);


}
