package com.techstack.oop.inheritance

class Dog extends Animal {
	
	String dogName;
	
	def plays() {
		println "$dogName likes to play"
	}
	
	def eats() {
		println "$dogName like to eat"
	}
}
