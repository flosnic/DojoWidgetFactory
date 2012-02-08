package com.dojowidgetfactory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class DojoWidgetFactory {
	 
	private static String TAG_DELIM = ":";
	String dojoFieldName="";
	String fieldName="";
	String fieldLabel="";
	String fieldValue="";
	String fieldLength="";
	boolean isReadOnly=false;
	boolean isRequired=false;
	boolean isExpress=false;
	boolean labelIsStacked=false;
	String htmlProps="";
	String widgetProps=""; 
	Object[] arguments = {
			 dojoFieldName,
			 fieldName,
			 fieldLabel,
			 fieldValue,
			 fieldLength,
			 isReadOnly,
			 isRequired,
			 isExpress,
			 labelIsStacked,
			 htmlProps,
			 widgetProps
		};
	public static String dojoLookUp(String key) {
		ResourceBundle rb = ResourceBundle.getBundle("com.dojofactory.util.dojo");
		Enumeration <String> keys = rb.getKeys();
		String value="";
		while (keys.hasMoreElements()) {
			if(keys.nextElement().equalsIgnoreCase(key)){
			value = rb.getString(key);
			}
		}
		return value;
	}
	public static String createDojoField(String dojoField,Object... arguments ){
		//System.out.print(dojoField);
		HashMap<String, String> tagMap=new HashMap<String, String>();
		StringBuffer html = new StringBuffer();
		if(dojoField.equalsIgnoreCase("TEXTBOX")){
			html.append("<input data-dojo-type=\"");
			html.append(dojoLookUp(dojoField));
			html.append("\" ");
			
		}
		 
			 for (Object param : arguments) {
					String key = ((String) param).substring(0,
							((String) param).indexOf(TAG_DELIM));
					
						String value = ((String) param).substring(
								((String) param).indexOf(TAG_DELIM)+1,
								((String) param).length());
						tagMap.put(key, value);
						html.append(key);
						html.append("=\"");
						html.append(value);
						html.append("\" ");
		}
			 html.append("id=\"");
			 html.append(tagMap.get("name")); 
			 html.append("\" ");
			 html.append("/>"); 
	    
		
		//return arguments[0].toString();
		 return html.toString();
	}
	
	
}
