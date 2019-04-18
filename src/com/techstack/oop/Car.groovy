package com.techstack.oop

class Car {
	
	String name;
	String color;
	int model;
	
	def getCarDetails() {
		println "You are driving $model, $color colored $name"
	}
	
	def startEngine() {
		println "Starting engine for $name"
	}

	static void main(args) {
		Car ford = new Car()
		ford.name = "Ecosport"
		ford.color = "Blue"
		ford.model = 2019
		
		Car toyota = new Car()
		toyota.name = "Innova"
		toyota.color = "While"
		toyota.model = 2019
		
		Car bmw = new Car()
		bmw.name = "C7"
		bmw.color = "Red"
		bmw.model = 2017
		
		ford.getCarDetails()
		ford.startEngine()
		println "=========================="
		
		toyota.getCarDetails()
		toyota.startEngine()
		println "=========================="
		
		bmw.getCarDetails()
		bmw.startEngine()
		println "=========================="
	}
}
