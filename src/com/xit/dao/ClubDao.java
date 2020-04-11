package com.xit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xit.beans.Club;

public interface ClubDao {

	//List<Club> selectAll();

	int CountClubs();

	List<Club> selectAllByPage(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);

	List<Club> selectClubByCondition(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,@Param("clubName")String clubName);

	int CountClubsByCondition(@Param("clubName")String clubName);

	Club selectClubByUser(Integer userId);

	void deleteClubByClubId(Integer clubId);

	/* void insertClub(Club club); */
}
