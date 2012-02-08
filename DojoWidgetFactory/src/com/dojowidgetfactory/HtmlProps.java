package com.dojowidgetfactory;

public class HtmlProps {

	int width=0;
	int length=0;
	boolean isRequired=false;
	boolean isReadOnly = false;
	public int getWidth() {
		return width;
	}
	
	HtmlProps(int width,int length,boolean isReadOnly,boolean isRequired){
		this.setLength(length);
		this.setWidth(width);
		this.setReadOnly(isReadOnly);
		this.setRequired(isRequired);
		
		
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
	public boolean isReadOnly() {
		return isReadOnly;
	}
	public void setReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}
	
	
	
	
	
	
}
