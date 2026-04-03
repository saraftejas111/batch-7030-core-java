package com.setstudy;

public class WardBoys {

	private int id ;
	private String name ;
	public WardBoys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WardBoys(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "WardBoys [id=" + id + ", name=" + name + "]";
	} 
	
	
}
