package com.techstack.basic

def num = 11

if(num == 10) {
	println "number is 10";
} else {
	println "number is NOT 10"
}

//==================================

//How to check is +ve or -ve
def value = 10
if(value > 0)
	println "number is +ve"
else if(value == 0)
	println "number is zero"
else 
	println "number is -ve"
	

//==================================
	
//switch - case
def x = 0
def result = ""

switch(x) {
	case 0:
		result = "x is zero"
		break
	case {x > 0}:
		result = "x is +ve"
		break
	case {x < 0}:
		result = "x is -ve"
		break
	default:
		result = "Invalid number"
}
println result