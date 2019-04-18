package com.techstack.basic

//============= Defining Variables =========
def name = "Karthi"	//def is a keyword for define a variable
println name

String name1 = "Karthi" //String, int are other variable types
println name1

//This is not recommended. It will leads to problems during complex program
name2 = "Karthi" //variable without a type
println name2

//Appending String with value using +
println 'My Name is ' + name2

/*
 * Using SingleQuote String expression with ${}.
 * Treated as complete string
 */
println 'My Name is ${name2}'

/*
 * Using DoubleQuote String expression with ${}.
 * Value will be substituted for the given expression
 */
println "My Name is ${name2}"

/*
 * Without {} simple print the expression value using $variable
 */
println "My Name is $name2"

//============== Naming Variables ==============

//You can use Letters, Digits, Underscore in your variables
def _name4 = "To test variable name"
println _name4

//Groovy is a case sensitive
def x = 10
def X = 20
println x
println X

//Groovy is dynamically typed
def value = "Test"
value = 10
println value

def (a, b, c) = [50, 60, 70]
println a
println b
println c

def (String a1, int b1, Double c1) = [50, 60, 70]
println a1
println b1
println c1

// c2 does not have a value; it will hold null
def (String a2, int b2, Double c2) = [50, 60, 70]
println a2
println b2
println c2

//Value 70 will be ignored
def (String a3, int b3) = [50, 60, 70]
println a3
println b3


