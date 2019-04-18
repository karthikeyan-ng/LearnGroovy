package com.techstack.basic

/*
def methodName() {
	
}
*/

// Method with no args
def printHello() {
	println "Hello..."
}

printHello()

//===============================
// Method with arguments
def sum(int a, int b) {
	println "Sum is " + (a+b)
}

sum(10, 20)
//sum()	//==> Exception: No signature of method: com.techstack.basic.Methods.sum() is applicable for argument types: () values: []

def sum1(int a1=10, int b1=20) {
	println "Sum is " + (a1+b1)
}
sum1() //==>If not supply any value, defaults will be used
sum1(5)

//===============================
// Method with return value
def sub(int a, int b) {
	def c = a - b
	return c
}
println sub(10, 5)
def result = sub(20, 11)
println result