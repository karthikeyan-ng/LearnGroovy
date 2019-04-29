package com.techstack.oop.inheritance

class Toyota extends Car {
	
	int topSpeed;
	
	def topSpeed() {
		println "Top speed is $topSpeed"
	}
	
	static void main(args) {
		Toyota toyota = new Toyota()
		toyota.name = "Toyota"
		toyota.color = "Red"
		toyota.model = 2019
		toyota.topSpeed = 200
		toyota.startEngine()
		toyota.accelerate()
		toyota.topSpeed()
		toyota.stopEngine()
	}
}
