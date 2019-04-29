package com.techstack.oop.inheritance

class Animal {
	
	String name
	String breed
	
	def eats() {
		println "$name eats"
	}
	
	def moves() {
		println "$name moves"
	}
}
