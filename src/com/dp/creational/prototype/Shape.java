package com.dp.creational.prototype;

import com.CopyRight;

@CopyRight
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;
	
	public abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ce) {
			ce.printStackTrace();
		}
		return clone;
	}

}
