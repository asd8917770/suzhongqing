package com.bunfly.entity;
/**
 * 女性体检表
 * @author dzm
 *
 */
public class FemaleHealthForm extends HealthForm {
	//子宫
	private String uterus;

	public String getUterus() {
		return uterus;
	}

	public void setUterus(String uterus) {
		this.uterus = uterus;
	}

	@Override
	public String toString() {
		return "FemaleHealthForm [uterus=" + uterus + "]";
	}
	
	
}
