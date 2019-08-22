package com.sodimac.automation.model;

public class Lov {
	public int lov_id;
	public String type;
	public String value;
	public String key;
	public int fk_parent_id;
	
	public int getLov_id() {
		return lov_id;
	}
	public void setLov_id(int lov_id) {
		this.lov_id = lov_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getFk_parent_id() {
		return fk_parent_id;
	}
	public void setFk_parent_id(int fk_parent_id) {
		this.fk_parent_id = fk_parent_id;
	}
	
}
