package com.xit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xit.beans.Application;
import com.xit.beans.Club;

public interface ApplicationDao {


	void insertApplication(Application application);

	List<Application> selectApplicationsByUserId(int userId);

	int countApplications();

	List<Application> selectAllByPage(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);

	void delete(Integer id);

	List<Application> selectAllByPageAndClub(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,@Param("clubId") Integer clubId);

	int countApplicationsByClub(Integer clubId);

	void updateApplicationById(@Param("id")Integer id,@Param("status")String status);

	void addApplicationByCreateClub(Application application);

}
