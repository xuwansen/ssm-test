package com.xit.Service;

import java.util.List;

import com.xit.beans.Club;

public interface ClubService {

	int CountClubs();
	List<Club> getClubsByPage(Integer pageNo, Integer pageSize);
	List<Club> getClubsByCondition(int pageNo, Integer pagesize, String clubName); 
  	int CountClubsByCondition(String clubName);
	/* void addClub(Club club); */
	Club getClubByUser(Integer userId);
	void removeClub(Integer clubId);
	 
}
