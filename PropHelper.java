package com.saki.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropHelper {
	
	public static String getProperty(String name){
		Locale currentLocale;
		currentLocale = new Locale("en","US");
		
		ResourceBundle rb = ResourceBundle.getBundle("props");
		return rb.getString(name);		
	}	

}
