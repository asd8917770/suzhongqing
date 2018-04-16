package com.bunfly.entity;

public class FemaleStudent extends Student  {

	private FemaleHealthForm femaleHealthForm;

	public FemaleHealthForm getFemaleHealthForm() {
		return femaleHealthForm;
	}

	public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
		this.femaleHealthForm = femaleHealthForm;
	}

	@Override
	public String toString() {
		return "FemaleStudent [femaleHealthForm=" + femaleHealthForm + "]";
	}

	
	
	
}
