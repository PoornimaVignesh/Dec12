package org.sss;

public abstract class IciciBank {//parent class
	abstract void savings();
	abstract void deposit();
	//non abstract method
	public void fixed() {
		System.out.println("Icici banked fixed:12%");
	}
		
	}



