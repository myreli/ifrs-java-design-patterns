package com.model;

public class Igor extends HumanPrototype {

	public Igor() {
		this.name  = "Igor Avila Pereira";
		this.aka   = "teacher";
		this.tag   = "IGOR00";		
		this.genes = "igor's genes";
	}
	
	protected Igor(Igor igor) {
		this.name  = igor.getName();
		this.aka   = igor.getAka();
		this.tag   = igor.getTag();
		this.genes = igor.getGenes();
	}
	
	@Override
	public String info() {
		return "PROTOTYPE: " + getTag() + " | " + getGenes() + " | " + getName() + " also known as " + getAka();
	}

	@Override
	public Igor clone() {
		return new Igor(this);
	}
}