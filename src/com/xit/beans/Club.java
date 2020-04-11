package com.xit.beans;

import java.util.Date;

public class Club {
	private Integer clubId;
	private String clubName;
	private String clubInfo;
	private Integer clubOwner;
	private Date createTime;
	private User user;
	
	public Club() {
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubInfo() {
		return clubInfo;
	}

	public void setClubInfo(String clubInfo) {
		this.clubInfo = clubInfo;
	}

	public Integer getClubOwner() {
		return clubOwner;
	}

	public void setClubOwner(Integer clubOwner) {
		this.clubOwner = clubOwner;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Club [clubId=" + clubId + ", clubName=" + clubName + ", clubInfo=" + clubInfo + ", clubOwner="
				+ clubOwner + ", createTime=" + createTime + ", user=" + user + "]";
	}
	
	
	
}
