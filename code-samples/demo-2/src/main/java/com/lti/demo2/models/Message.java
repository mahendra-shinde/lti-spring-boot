package com.lti.demo2.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement ///Mark this class for conversion into XML
public class Message {

	private String value;

	public Message() {
	
	}

	public Message(String value) {
		super();
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
