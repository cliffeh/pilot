package com.cliftonsnyder.pilot.model;

import java.util.Hashtable;
import java.util.Date;

public class DataElement {
	private int id;
	private String text;
	private Date date;
	// private Hashtable<String, String> values;

	public DataElement() {
	}

	public DataElement(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public int getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

//	public Hashtable<String, String> getValues() {
//		return values;
//	}
//
//	public void setValues(Hashtable<String, String> values) {
//		this.values = values;
//	}

}
