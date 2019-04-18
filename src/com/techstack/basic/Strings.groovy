package com.techstack.basic

def name = "Karthi"
println name
println "My name is " + name
println "My name is ".concat(name)

//Interpolation possible in double quoted string
println "My name is ${name}"
println "My name is $name"

//Interpolation not possible in single quoted string
println 'My name is $name'
println 'My name is ${name}'

//Triple single or double quoted for multi line string
def s1 = """How are you?
Hope you doing well! 
See you soon"""
println s1

def s2 = '''How are you?
Hope you doing well! 
See you soon'''
println s2

//other methods
def name1 = "Pascal"
println name1.length()

println name1[2]		//get the char from index position 2 from forwards
println name1[-2]	//get the char from index position -2 from backwards
println name1.indexOf('r') //get the position of the given char in the string

println name1[0..2] //get the chars from 0 to 2 (inclusive)

println name1[5..3]	//get the chars from 5 to 3 (inclusive)

println name1[0, 2, 4] //get the chars from 0, 2, 4

println name1.substring(2) //substring from 2nd position (inclusive)

println name1.subSequence(1, 4) //substring from 1 to 4 (exclusive)


def str = "This is a Groovy class"
println str.split(" ")
println str-("Groovy ")	//The given chars "Groovy" will be discarded and remaining text will be printed
println str.replace("class", "session")

println str.toLowerCase()
println str.toUpperCase()
println str.toList() //Each char will be a list element

println "Groovy " * 3	//This will print given String for the given number of times (3)

println "Abc".equals("Abc")	//true
println "Abc".equals("abc")	//false
println "Abc".equalsIgnoreCase("abc")	//true

//===================================

def value = "Karthi"
//slashy
def s3 = /a green sky $value/	
//doller slashy
def s4 = $/a blue tree $value/$
println s3
println s4

//def s5 = "My name is "Karthi""	//Double quote not escaped
def s5 = "My name is \"Karthi\""	//Double quote escaped
println s5

def s6 = /My name is "Karthi"/		//Starting ending double quote was replaced with /
println s6
