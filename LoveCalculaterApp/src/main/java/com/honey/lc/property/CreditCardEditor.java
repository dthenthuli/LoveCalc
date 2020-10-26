package com.honey.lc.property;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import com.honey.lc.api.CreditCardDTO;

public class CreditCardEditor extends PropertyEditorSupport {
	@Override
	public String getAsText() {
		CreditCardDTO cc=((CreditCardDTO)getValue());
		return " "+cc;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
	
		String[] CreditCardDTONum=text.split("-");
		CreditCardDTO ccdto=new CreditCardDTO();
		ccdto.setFirstfourdigit(Integer.parseInt(CreditCardDTONum[0]));
		ccdto.setSecondfourdigit(Integer.parseInt(CreditCardDTONum[1]));
		ccdto.setThirdfourdigit(Integer.parseInt(CreditCardDTONum[2]));
		ccdto.setFourthfourdigit(Integer.parseInt(CreditCardDTONum[3]));
		
		
		
	setValue(ccdto);
	}

}
