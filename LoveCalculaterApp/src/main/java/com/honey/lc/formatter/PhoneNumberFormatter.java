package com.honey.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.honey.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {

		return object.getCountrycode() + "-" + object.getUsernumber();
	}

	@Override
	public Phone parse(String completenumber, Locale locale) throws ParseException {
		System.out.print("inside the parse method");

		Phone p = new Phone();

		String[] phone = completenumber.split("-");
		System.out.println(phone.length);
		if (completenumber.indexOf('-') == -1 ||completenumber.startsWith("-")) {
			p.setCountrycode("91");
		
if(completenumber.startsWith("-")) {
			
			p.setUsernumber(phone[1]);        
			}else {
				p.setCountrycode(phone[0]);
			}
	}	else {
		

 
			p.setCountrycode(phone[0]);
			p.setUsernumber(phone[1]);
		}

		return p;
	}

}
