package com.techstack.oop

class Student {

	private String name
	private int sub1Marks
	private int sub2Marks

	def printTotal() {
		println "$name has total marks = " + (sub1Marks + sub2Marks)
	}
		
	static void main(args) {
		Student student1 = new Student()
		student1.name = "Mathew"
		student1.sub1Marks = 70
		student1.sub2Marks = 65
		student1.printTotal()
		
		Student student2 = new Student()
		student2.name = "John"
		student2.sub1Marks = 89
		student2.sub2Marks = 82
		student2.printTotal()
	}
}
