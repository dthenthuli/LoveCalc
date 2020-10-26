package com.honey.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.honey.lc.api.CreditCardDTO;

public class CreditCardFormatter implements Formatter<CreditCardDTO> {

	@Override
	public String print(CreditCardDTO object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditCardDTO parse(String text, Locale locale) throws ParseException {
		String[] CreditCardDTONum=text.split("-");
		CreditCardDTO ccdto=new CreditCardDTO();
		ccdto.setFirstfourdigit(Integer.parseInt(CreditCardDTONum[0]));
		ccdto.setSecondfourdigit(Integer.parseInt(CreditCardDTONum[1]));
		ccdto.setThirdfourdigit(Integer.parseInt(CreditCardDTONum[2]));
		ccdto.setFourthfourdigit(Integer.parseInt(CreditCardDTONum[3]));
		
		
		
		return ccdto;
	}

	
}
