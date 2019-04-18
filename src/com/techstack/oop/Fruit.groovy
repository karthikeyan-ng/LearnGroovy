package com.techstack.oop

class Fruit {

	private String fruitName
	private String fruitColor
	
	def setFruitName(String name) {
		fruitName = name
	}
	
	def setFruitColor(String color) {
		fruitColor = color
	}
	
	def getFruitName() {
		println "Name of the fruit is $fruitName"
	}
	
	def getFruitColor() {
		println "Color of the fruit is $fruitColor"
	}
	
	static void main(args) {
		Fruit apple = new Fruit()
		apple.setFruitColor("Red")
		apple.setFruitName("Apple")
		apple.getFruitName()
		apple.getFruitColor()
	}
}
