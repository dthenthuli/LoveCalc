 package com.honey.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.honey.lc.api.CommunicationDTO;
import com.honey.lc.api.Phone;
import com.honey.lc.api.RegInfoDTO;
import com.honey.lc.api.UserInfoDTO;
import com.honey.lc.property.CustomNameEditor;
import com.honey.lc.validator.UserNameValiadator;

@Controller
public class LcAppController {
		
	@RequestMapping("/")
   public String  showHomePage(@ModelAttribute("userinfo") UserInfoDTO userinfo) {
		
		
		return "Home-Page";
		
	}
	
	@RequestMapping("/process-result")
   public String  showResultPage(@Valid @ModelAttribute("userinfo") UserInfoDTO userinfo,BindingResult result) {
		 
		if(result.hasErrors()) {
			List<ObjectError> li=result.getAllErrors();
			for(ObjectError temp:li) {
				System.out.print(temp);
			}
			return "Home-Page";
		}
		
		
		
		return "Result-Page";
		
	}
	
	@RequestMapping("/Register")
	public String showRegisterPage(@ModelAttribute("reginfo") RegInfoDTO reginfo) {
		System.out.println("inside the register method");
		Phone p=new Phone();
		p.setCountrycode("91");
		p.setUsernumber("9934536587");
		CommunicationDTO commdto=new CommunicationDTO();
		commdto.setPhone(p);
		reginfo.setCommunicationdto(commdto);
		
		return"Register-Page"; 
	}
	@RequestMapping("/Reg-Success")
	public String showRegisterPageSuccess( @Valid @ModelAttribute("reginfo") RegInfoDTO reginfo,BindingResult result) {
		System.out.println("inside the register process method");
		if(result.hasErrors()) {
			List<ObjectError> li=result.getAllErrors();
			for(ObjectError temp:li) {
				System.out.print(temp);
			}
			return"Register-Page";
			
		} 
		return"Register-SuccessPage";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {//webdatabinder--->binding that is responsible of setting property values on to a target object 
		System.out.println("inside initbinder");
		//StringTrimmerEditor timmer=new StringTrimmerEditor(true);//covert white space to null
		StringTrimmerEditor timmer=new StringTrimmerEditor(false);//convert remove the white space and it's not covert to null
		binder.registerCustomEditor(String.class,"name",timmer);
		CustomNameEditor cne=new CustomNameEditor();
		binder.registerCustomEditor(String.class,"name",cne);
		
		
		binder.addValidators(new UserNameValiadator());
		
	}   
	
	
	
}
