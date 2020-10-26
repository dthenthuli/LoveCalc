package com.honey.lc.convator;

import org.springframework.core.convert.converter.Converter;

import com.honey.lc.api.CreditCardDTO;

public class CreditConverterObjectToString implements Converter<CreditCardDTO, String> {

	@Override
	public String convert(CreditCardDTO source) {
		// TODO Auto-generated method stub
		return "sample"+source.getFirstfourdigit();
	}

}
