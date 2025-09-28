package org.demo;

public class Sample {
	
	private void studName() {
		System.out.println("Name is divin");

	}
	
	private void studRank() {
		System.out.println("Rank is 8");
	}
	private void empName() {
		System.out.println("Name is Divin");

	}
	
	private void empId() {
		System.out.println("ID is 45");


	}
	
	public static void main(String[] args) {

		Sample a = new Sample();
		a.studName();
		a.studRank();
		
		Sample s = new Sample();
		s.empName();
		s.empId();
		
		
		

	}

}
