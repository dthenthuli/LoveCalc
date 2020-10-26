package com.honey.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.honey.lc.api.Phone;

public class PhoneValidator implements ConstraintValidator<PhoneAno, String> {
	int max;
	@Override
	public void initialize(PhoneAno phone) {
		System.out.println("phone validator");
		this.max=phone.max();
	} 

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println("phone validator");
	
		
		if(value==null||value.length()!=max) {
			return false;  
		}
		
	char c[]=value.toCharArray();
	for(char c1:c) {
		if(Character.isDigit(c1)) {
			continue;
		}else {
			
			return false;
		}
	}
		
		return true;
	}

}
