package com.xit.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xit.Service.ApplicationService;
import com.xit.beans.Application;
import com.xit.beans.Club;
import com.xit.dao.ApplicationDao;
@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	ApplicationDao applicationDao;

	@Override
	public void addApplication(Application application) {
		applicationDao.insertApplication(application);
	}

	@Override
	public List<Application> getApplications(int userId) {
		return applicationDao.selectApplicationsByUserId(userId);
	}

	@Override
	public int CountApplications() {
		return applicationDao.countApplications();
	}

	@Override
	public List<Application> getApplicationsByPage(Integer pageNo, Integer pageSize) {
		Integer page = (pageNo - 1) * pageSize;
		return applicationDao.selectAllByPage(page, pageSize);
	}

	@Override
	public void remove(Integer id) {
		applicationDao.delete(id);
	}

	@Override
	public List<Application> getApplicationsByClubAndPage(Integer pageNo, Integer pageSize, Integer clubId) {
		Integer page = (pageNo - 1) * pageSize;
		return applicationDao.selectAllByPageAndClub(page, pageSize,clubId);
	}

	@Override
	public int CountApplicationsByClub(Integer clubId) {
		return applicationDao.countApplicationsByClub(clubId);
	}

	@Override
	public void alterApplicationById(Integer id, String status) {
		applicationDao.updateApplicationById(id,status);
	}

	@Override
	public void addApplicationByCreateClub(Application application) {
		applicationDao.addApplicationByCreateClub(application);
	}





}
