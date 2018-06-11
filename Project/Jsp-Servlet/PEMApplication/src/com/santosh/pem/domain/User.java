package com.santosh.pem.domain;

/**
 * This is a POJO class for users
 * @author Santosh Pandey
 *
 */
public class User {
	
	/**
	 * User ID
	 * auto-generated in Database
	 */
	private int id;
	
	/**
	 * User First Name
	 */
	private String firstName;
	
	/**
	 * User Last Name
	 */
	private String lastName;
	
	/**
	 * User Login Name
	 */
	private String loginName;
	
	/**
	 * User Password
	 */
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public User(String firstName, String lastName, String loginName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName = loginName;
		this.password = password;
	}
	public User(int id, String firstName, String lastName, String loginName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName = loginName;
		this.password = password;
	}
	public User() {
	
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", loginName=" + loginName
				+ ", password=" + password + "]";
	}
	
	

}
