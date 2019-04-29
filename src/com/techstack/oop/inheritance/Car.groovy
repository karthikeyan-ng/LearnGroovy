package com.techstack.oop.inheritance

class Car {
	
	String name;
	String color;
	String model;
	
	def startEngine() {
		println "Engine Started for $name"
	}
	
	def stopEngine() {
		println "Engine Stopped for $name"
	}
	
	def accelerate() {
		println "Accelerating $name"
	}
}
