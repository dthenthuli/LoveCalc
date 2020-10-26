package com.honey.lc.formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.honey.lc.api.AmountDTO;

public class CurrencyFormatter implements Formatter<AmountDTO> {

	@Override
	public String print(AmountDTO object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AmountDTO parse(String text, Locale locale) throws ParseException {
		
		String text1[]=text.split(" ");
		
		Currency c=Currency.getInstance(text1[1].toUpperCase());
		String currsymbol=c.getSymbol(locale);
		AmountDTO amountdto=new AmountDTO();
		amountdto.setBillamount(new BigDecimal(Integer.parseInt(text1[0])));
		amountdto.setLocaleDefinition(currsymbol);
		
		return amountdto ;
	}  

}
 