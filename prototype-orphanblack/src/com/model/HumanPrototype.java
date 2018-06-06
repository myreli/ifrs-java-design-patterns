package com.model;

public abstract class HumanPrototype {

	protected String name;
	protected String aka;
	protected String tag;
	protected Object genes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAka() {
		return aka;
	}
	public void setAka(String aka) {
		this.aka = aka;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Object getGenes() {
		return genes;
	}

	public abstract String info();
	public abstract HumanPrototype clone();
	
}
