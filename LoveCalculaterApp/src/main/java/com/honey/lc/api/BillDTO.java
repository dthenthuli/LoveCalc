package com.honey.lc.api;

import java.util.Date;

public class BillDTO {
	
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private CreditCardDTO creditcarddto;
	public CreditCardDTO getCreditcarddto() {
		return creditcarddto;
	}
	public void setCreditcarddto(CreditCardDTO creditcarddto) {
		this.creditcarddto = creditcarddto;
	}
	public AmountDTO getAmountdto() {
		return amountdto;
	}
	public void setAmountdto(AmountDTO amountdto) {
		this.amountdto = amountdto;
	}
	private AmountDTO amountdto;

}
