package com.shimh.ioc.messagesource;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleAndResourceBundle {
	/*
	 * 国际化信息 ：语言信息和国家/地区
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Locale l  = Locale.US;
		ResourceBundle rb = ResourceBundle.getBundle("messages", l);
		System.out.println(rb.getString("say"));
		
		Locale l2  = Locale.getDefault();
		ResourceBundle rb2 = ResourceBundle.getBundle("messages", l2);
		
		System.out.println(rb2.getString("say"));
		
		
		//-------工具库
		double money = 123456;
		
		NumberFormat l_nf = NumberFormat.getCurrencyInstance(l); 
		System.out.println(l_nf.format(money));
		
		NumberFormat l2_nf = NumberFormat.getCurrencyInstance(l2); 
		System.out.println(l2_nf.format(money));
		
		String p = "今天是{0},天气{1}";
		String[] o = {"星期一","晴"};
		
		MessageFormat l_mf = new MessageFormat(p);
		System.out.println(l_mf.format(o));
		
	}
}
