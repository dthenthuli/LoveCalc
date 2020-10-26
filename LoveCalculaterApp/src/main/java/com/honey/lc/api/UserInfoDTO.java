package com.honey.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message="* your name can't be blank")
	@Size(min=3,max=15,message="* your name should be char between3-15")
	private String yourname;
	
	@AssertTrue(message="agree to use our app")
	private boolean termsandcon;

	public boolean isTermsandcon() {
		return termsandcon;
	}

	public void setTermsandcon(boolean termsandcon) {
		this.termsandcon = termsandcon;
	}

	public String getYourname() {
		return yourname;
	}

	public void setYourname(String yourname) {
		this.yourname = yourname;
	}

	public String getCurshname() {
		return curshname;
	}

	public void setCurshname(String curshname) {
		this.curshname = curshname;
	}   
	@NotBlank(message="* curshname can't be blank")
	@Size(min=3,max=15,message="* curshname should be char between3-15")
	private String curshname;

}
