package com.dojowidgetfactory;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class DojoWidgetFactoryTest {

	/**
	 * @param args
	 */
	static String DOJOTEXTFIELD = "dijit.form.TextBox";
	public static void main(String[] args) {
		/*StringBuilder sb = new StringBuilder();
		// TODO Auto-generated method stub
		
		System.out.println("In JSP"+DojoWidgetFactory.createDojoField(DOJOTEXTFIELD,new HtmlProps(2,3,false,true)));
		ResourceBundle rb = ResourceBundle.getBundle("com.dojofactory.util.dojo");
		Enumeration <String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = rb.getString(key);
			System.out.println(value);
		}*/
		//System.out.println(DojoWidgetFactory.dojoLookUp("TEXTBOX"));
		System.out.println(DojoWidgetFactory.createDojoField("TEXTBOX", "name:pradeep"));
		
	}

}
