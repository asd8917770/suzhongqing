package com.bunfly.entity;
/**
 * 体检表
 * @author dzm
 *
 */
public class HealthForm {
	//体检表编号
	private Long id;
	//学生编号
	private Long sId;
	/**
	 * 心
	 */
	private String heart;
	/**
	 * 肝
	 */
	private String liver;
	/**
	 * 脾
	 */
	private String spleen;
	/**
	 * 肺
	 */
	private String lung;
	/**
	 * 肾
	 */
	private String kidney;
	/**
	 * 备注
	 */
	private String note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	public String getLiver() {
		return liver;
	}

	public void setLiver(String liver) {
		this.liver = liver;
	}

	public String getSpleen() {
		return spleen;
	}

	public void setSpleen(String spleen) {
		this.spleen = spleen;
	}

	public String getLung() {
		return lung;
	}

	public void setLung(String lung) {
		this.lung = lung;
	}

	public String getKidney() {
		return kidney;
	}

	public void setKidney(String kidney) {
		this.kidney = kidney;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "HealthForm [id=" + id + ", sId=" + sId + ", heart=" + heart + ", liver=" + liver + ", spleen=" + spleen
				+ ", lung=" + lung + ", kidney=" + kidney + ", note=" + note + "]";
	}
	
	
}
