package com.lbg.tcs.boot.app.model;

public class AuthDetails {
	
	private String userID;
		
	private String password;
	
	private String securityCode;
	
	public AuthDetails(String userID, String password, String securityCode) {
		super();
		this.userID = userID;
		this.password = password;
		this.securityCode = securityCode;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
}
