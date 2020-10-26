package com.honey.lc.controllers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.honey.lc.api.BillDTO;
import com.honey.lc.api.CreditCardDTO;
import com.honey.lc.property.CreditCardEditor;

@Controller
public class BillAppController {

	@RequestMapping("billpage")
	public String showBillPage(@ModelAttribute("billdto") BillDTO billdto) {

		CreditCardDTO ccd = new CreditCardDTO();
		ccd.setFirstfourdigit(1233);
		ccd.setSecondfourdigit(3456);
		ccd.setThirdfourdigit(2332);
		ccd.setFourthfourdigit(6535);
		billdto.setCreditcarddto(ccd);
		return "Bill";

	}

	@RequestMapping("billresult") 
	public String showBillResult(@ModelAttribute("billdto") BillDTO billdto) {

		return "BillResult";

	}

	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor cus = new CustomDateEditor(sm, true);
		wdb.registerCustomEditor(Date.class, "date", cus);

		/*
		 * NumberFormat num=new DecimalFormat("##,###.00"); CustomNumberEditor cne=new
		 * CustomNumberEditor(BigDecimal.class,num,true);
		 * wdb.registerCustomEditor(BigDecimal.class,"billamount", cne);
		 */

		// CreditCardEditor cc=new CreditCardEditor();
		// wdb.registerCustomEditor(CreditCardDTO.class,"creditcarddto", cc);

	}

}
