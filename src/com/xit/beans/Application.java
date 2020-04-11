package com.xit.beans;

import java.util.Date;

/**
 * @author 许万森
 * @创建时间 2020年2月18日
 *
 */
public class Application {
	private Integer id;
	private Integer applicant;
	private String category;
	private int targetClub;
	private Date applicationDate;
	private String status;
	private User user;
	private Club club;
	private String formatDate;
	
		
	public String getFormatDate() {
		return formatDate;
	}

	public void setFormatDate(String formatDate) {
		this.formatDate = formatDate;
	}

	public Application() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApplicant() {
		return applicant;
	}

	public void setApplicant(Integer applicant) {
		this.applicant = applicant;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getTargetClub() {
		return targetClub;
	}

	public void setTargetClub(int targetClub) {
		this.targetClub = targetClub;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", applicant=" + applicant + ", category=" + category + ", targetClub="
				+ targetClub + ", applicationDate=" + applicationDate + ", status=" + status + ", user=" + user
				+ ", club=" + club + "]";
	}
	
}
