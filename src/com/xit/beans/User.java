package com.xit.beans;

public class User {
	private Integer userId;
	private String userName;
	private String userPassword;
	private String gender;
	private String major;
	private Integer age;
	private String phone;
	private String privilege;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	public User() {
	}
	public User(Integer userId, String userName, String userPassword, String gender, String major, Integer age,
			String phone, String privilege) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.gender = gender;
		this.major = major;
		this.age = age;
		this.phone = phone;
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", gender="
				+ gender + ", major=" + major + ", age=" + age + ", phone=" + phone + ", privilege=" + privilege + "]";
	}
	
}

