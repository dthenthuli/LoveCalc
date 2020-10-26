   package com.honey.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.honey.lc.api.RegInfoDTO;

public class UserNameValiadator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return RegInfoDTO.class.equals(clazz);
	}
//we need to write our custom validation logic
	@Override
	public void validate(Object target, Errors errors) {
	
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty","username should not be empty");
 
 
	}

}
