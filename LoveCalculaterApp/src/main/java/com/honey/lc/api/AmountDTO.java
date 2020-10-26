package com.honey.lc.api;

import java.math.BigDecimal;

public class AmountDTO {
	@Override
	public String toString() {
		return billamount + " " + localeDefinition ;
	}
	private BigDecimal billamount;
	public BigDecimal getBillamount() {
		return billamount;   
	}
	public void setBillamount(BigDecimal billamount) {
		this.billamount = billamount;
	}
	public String getLocaleDefinition() {
		return localeDefinition;
	}
	public void setLocaleDefinition(String localeDefinition) {
		this.localeDefinition = localeDefinition;
	}
	private String localeDefinition;

}

