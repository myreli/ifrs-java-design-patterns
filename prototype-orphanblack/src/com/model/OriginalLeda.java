package com.model;

// spoiler: Kendall Malone
public class OriginalLeda extends HumanPrototype {

	public OriginalLeda() {
		this.name  = "Kendall Malone";
		this.aka   = "The original";
		this.tag   = "LEDA00";		
		this.genes = "amount of crazy science";
	}
	
	protected OriginalLeda(OriginalLeda originalLeda) {
		this.name  = originalLeda.getName();
		this.aka   = originalLeda.getAka();
		this.tag   = originalLeda.getTag();
		this.genes = originalLeda.getGenes();
	}
	
	@Override
	public String info() {
		return "EXPERIMENT: " + getTag() + " | " + getGenes() + " | " + getName() + " also known as " + getAka();
	}

	@Override
	public HumanPrototype clone() {
		return new OriginalLeda(this);
	}
}