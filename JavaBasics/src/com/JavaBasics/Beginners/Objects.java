package com.JavaBasics.Beginners;

public class Objects {

	public static String comingSoon() {
		System.out.println("coming soon");
		return "Coming soon";
		
	}
	public static void main(String[] args) {
		Objects india= new Objects();
		Objects spain= new Objects();
		spain.comingSoon();
		india.comingSoon();		
		}
}
