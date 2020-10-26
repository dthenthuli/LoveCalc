package com.honey.lc.property;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class CustomNameEditor extends PropertiesEditor {
	 
	public void setAsText(String text) throws IllegalArgumentException {
		
		
		text=text.toUpperCase();
	super.setValue(text);
		
	}

}
