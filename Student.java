package com.sayan;

public class Student {
	private int roll;
	private String name;
	private float result;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	
	public void display() {
		System.out.println("roll: " + this.roll);
		System.out.println("name: " + this.name);
		System.out.println("result: " + this.result);
	}
	
	
}
