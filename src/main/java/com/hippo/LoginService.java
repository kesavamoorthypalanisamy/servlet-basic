package com.hippo;

public class LoginService {

	public boolean doValidate(String name,String password) {
		if(name.contentEquals("kesava") && password.equals("dummy")) {
			return true;
		}else {
			return false;
		}
	}
}
