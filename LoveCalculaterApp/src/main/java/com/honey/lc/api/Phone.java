package com.honey.lc.api;

import com.honey.lc.validator.PhoneAno;


public class Phone {
	
public Phone() {
	System.out.println("phone class con");
	}
private String countrycode;
public String getCountrycode() {
	return countrycode;
}
public void setCountrycode(String countrycode) {
	this.countrycode = countrycode;
}
public String getUsernumber() {
	return usernumber;
}
@Override
public String toString() {
	return  countrycode + "-" + usernumber ;
}
public void setUsernumber(String usernumber) {
	this.usernumber = usernumber;
}
@PhoneAno(max=10)
private String usernumber;
}
