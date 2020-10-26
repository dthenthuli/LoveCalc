package com.honey.lc.api;



import javax.validation.constraints.NotEmpty;

import com.honey.lc.validator.Age;
import com.honey.lc.validator.PhoneAno;

public class RegInfoDTO {
	@NotEmpty(message="name is  Not Empty")
	private String name; 


	private CommunicationDTO communicationdto;
	
	public RegInfoDTO() {
		System.out.println("RegInfoDTO");
	}

	@Age(lower=40,upper=70)
	private Integer age=0;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String username;

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public CommunicationDTO getCommunicationdto() {
		return communicationdto;
	}

	public void setCommunicationdto(CommunicationDTO communicationdto) {
		this.communicationdto = communicationdto;
	}

	

	private char[] password;
	private String country;
	private String[] hobby;
	private String gender;
}
