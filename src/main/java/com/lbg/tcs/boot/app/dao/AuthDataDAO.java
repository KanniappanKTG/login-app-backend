package com.lbg.tcs.boot.app.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.lbg.tcs.boot.app.model.AuthDetails;

@Repository
public class AuthDataDAO {

	private ArrayList<AuthDetails> getAllEmployees() {
		ArrayList<AuthDetails> authDetailsList = new ArrayList<AuthDetails>();
		AuthDetails authDetails1 = new AuthDetails("8761437", "Qwerty123", "LBG123");
		AuthDetails authDetails2 = new AuthDetails("8903194", "Welcome123", "Sec123");
		AuthDetails authDetails3 = new AuthDetails("8548561", "Stp12345", "TCSLGB02");
		authDetailsList.add(authDetails1);
		authDetailsList.add(authDetails2);
		authDetailsList.add(authDetails3);
		return authDetailsList;
	}

	public AuthDetails getAuthDetailsByID(String userID) {
		AuthDetails retVal = null;
		for (AuthDetails data : getAllEmployees()) {
			if (userID.equals(data.getUserID())) {
				retVal = data;
				break;
			}
		}
		return retVal;
	}

}
