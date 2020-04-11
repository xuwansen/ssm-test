package com.xit.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xit.Service.ClubService;
import com.xit.beans.Club;
import com.xit.dao.ClubDao;

@Service
public class ClubServiceImpl implements ClubService {
	@Autowired
	ClubDao clubDao;

	@Override
	public int CountClubs() {
		return clubDao.CountClubs();
	}

	@Override
	public List<Club> getClubsByPage(Integer pageNo, Integer pageSize) {
		Integer page = (pageNo - 1) * pageSize;
		return clubDao.selectAllByPage(page, pageSize);
	}

	@Override
	public List<Club> getClubsByCondition(int pageNo, Integer pageSize, String clubName) {
		Integer page = (pageNo - 1) * pageSize;
		return clubDao.selectClubByCondition(page, pageSize, clubName);
	}

	@Override
	public int CountClubsByCondition(String clubName) {
		return clubDao.CountClubsByCondition(clubName);
	}

	@Override
	public Club getClubByUser(Integer userId) {
		return clubDao.selectClubByUser(userId);
	}

	@Override
	public void removeClub(Integer clubId) {
		clubDao.deleteClubByClubId(clubId);
	}

	/*
	 * @Override public void addClub(Club club) { clubDao.insertClub(club); }
	 */

}
