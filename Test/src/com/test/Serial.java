package com.test;

import java.io.Serializable;

public class Serial implements Serializable {
	/** * */
	private static final long serialVersionUID = 1L;
	int id;
	String name1;

	public Serial(int id, String name) {
		this.id = id;
		this.name1 = name;
	}

	public String toString() {
		return "DATA: " + id + " " + name1;
	}
}