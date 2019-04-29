package com.techstack.oop.abstracts

class Toyota extends Car {

	int topSpeed;
	
	@Override
	public Object topSpeed() {
		println "Top speed for $name is $topSpeed"
	}
	
	static void main(args) {
		//Car car = new Car(); //<== Error: Can't create an object for abstract class
		
		Toyota toyota = new Toyota()
		toyota.name = "Toyota"
		toyota.color = "Red"
		toyota.model = 2019
		toyota.topSpeed = 215
		toyota.startEngine()
		toyota.topSpeed()
	}
}
