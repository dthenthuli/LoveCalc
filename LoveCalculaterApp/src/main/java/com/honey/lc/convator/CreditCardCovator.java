package com.honey.lc.convator;

import org.springframework.core.convert.converter.Converter;

import com.honey.lc.api.CreditCardDTO;

public class CreditCardCovator implements Converter<String, CreditCardDTO> {

	@Override
	public CreditCardDTO convert(String source) { 
System.out.println("Converterclass");
		String[] CreditCardDTONum=source.split("-");
		CreditCardDTO ccdto=new CreditCardDTO();
		ccdto.setFirstfourdigit(Integer.parseInt(CreditCardDTONum[0]));
		ccdto.setSecondfourdigit(Integer.parseInt(CreditCardDTONum[1]));
		ccdto.setThirdfourdigit(Integer.parseInt(CreditCardDTONum[2]));
		ccdto.setFourthfourdigit(Integer.parseInt(CreditCardDTONum[3]));
		
		return ccdto;
	}

}
