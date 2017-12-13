package com.shimh.ioc.messagesource;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleAndResourceBundle {
	public static void main(String[] args) {
		Locale l  = Locale.US;
		ResourceBundle rb = ResourceBundle.getBundle("messages", l);
		System.out.println(rb.getString("say"));
		
		Locale l2  = Locale.getDefault();
		ResourceBundle rb2 = ResourceBundle.getBundle("messages", l2);
		
		System.out.println(rb2.getString("say"));
	}
}
