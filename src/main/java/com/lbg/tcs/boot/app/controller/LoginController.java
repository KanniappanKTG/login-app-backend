package com.lbg.tcs.boot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbg.tcs.boot.app.dao.AuthDataDAO;
import com.lbg.tcs.boot.app.model.AuthDetails;
import com.lbg.tcs.boot.app.model.AuthStatus;

@RestController
@RequestMapping(path = "/auth")
public class LoginController {

	@Autowired
	private AuthDataDAO authDao;

	@PostMapping(path = "/", consumes = "application/json")
	public AuthStatus addEmployee(@RequestBody AuthDetails details) {
		AuthDetails authData = authDao.getAuthDetailsByID(details.getUserID());

		Boolean authSuccess = Boolean.FALSE;
		if (details.getPassword() != null && authData.getPassword().equals(details.getPassword()))
			authSuccess = Boolean.TRUE;
		else if (details.getSecurityCode() != null && authData.getSecurityCode().equals(details.getSecurityCode()))
			authSuccess = Boolean.TRUE;

		AuthStatus resp = new AuthStatus();
		if (authSuccess)
			resp.setStatus("Success");
		else
			resp.setStatus("Failed");
		return resp;
	}
}