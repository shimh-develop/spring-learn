package com.shimh.ioc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class CarEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		String[] ps = text.split(",");
		
		Car c = new Car();
		c.setName(ps[0]);
		c.setMoney(Integer.parseInt(ps[1]));
		
		setValue(c);
		
	}

	
}
