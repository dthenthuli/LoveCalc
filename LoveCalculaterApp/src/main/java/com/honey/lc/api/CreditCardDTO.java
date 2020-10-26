package com.honey.lc.api;

public class CreditCardDTO {
	@Override
	public String toString() {
		return  firstfourdigit + "-" + secondfourdigit
				+ "-" + thirdfourdigit + "-" + fourthfourdigit ;
	}
	private Integer firstfourdigit;
	public Integer getFirstfourdigit() {
		return firstfourdigit;
	}
	public void setFirstfourdigit(Integer firstfourdigit) {
		this.firstfourdigit = firstfourdigit;
	}
	public Integer getSecondfourdigit() {
		return secondfourdigit;
	}
	public void setSecondfourdigit(Integer secondfourdigit) {
		this.secondfourdigit = secondfourdigit;
	}
	public Integer getThirdfourdigit() {
		return thirdfourdigit;
	}
	public void setThirdfourdigit(Integer thirdfourdigit) {
		this.thirdfourdigit = thirdfourdigit;
	}
	public Integer getFourthfourdigit() {
		return fourthfourdigit;
	}
	public void setFourthfourdigit(Integer fourthfourdigit) {
		this.fourthfourdigit = fourthfourdigit;
	}
	private Integer secondfourdigit;
	private Integer thirdfourdigit;
	private Integer fourthfourdigit;

}
