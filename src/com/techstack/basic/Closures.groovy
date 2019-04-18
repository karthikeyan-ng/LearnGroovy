package com.techstack.basic

//Simple closure
def myClousure1 = { println "Hello World" } //==> define a closure

myClousure1.call()	//==> call the closure

//====================================
//Simple closure with argument

def myClousure2 = { name -> println "Hello $name" }

myClousure2.call("Karthi")

//====================================
//Simple closure with argument and other variable

def str = "Hello"
def myClousure3 = { name -> println "$str $name" }

myClousure3.call("Karthi")

//====================================
//FYI: We can not access outside variable inside a method body.binding
//But it allowed in Closures

//def myMethod() {
//	println "$str"
//}
//myMethod()

//====================================
//Passing closure as a method argument and invoke

def myMethod1(closure) {
	closure.call("Groovy")
}
myMethod1(myClousure3)

//====================================
//How to get return value from closure

def myClousure4 = { 
	a, b, c -> return (a + b + c) 
}
def result = myClousure4.call(10, 20, 30)
println result
println myClousure4.call(10, 20, 30)

//====================================
//How to iterate a list elements

def myList = ["Java", "Phyton", "Spring Boot"]
println myList.each { it }

//====================================
//How to iterate a map elements

def myMap = [
	'subject' : 'Java',
	'topic' : 'Streams'
	]
println myMap.each { it }

//====================================
//Find a element from a list
//Doc: Finds the first value matching the closure condition

def myList1 = [1, 2, 3, 4, 5]
println myList1.find { item -> item == 3 }
println myList1.find { item -> item == 6 }	//==> Not found, then return null

println myList1.findAll { item -> item > 3 }
println myList1.any { item -> item > 3 }	//==> return true
println myList1.any { item -> item > 7 }	//==> return false
println myList1.every { item -> item > 3 }	//==> checks every item should be >3, then true else false
println myList1.collect { item -> item * 3 }	//==> process the item and return the result


