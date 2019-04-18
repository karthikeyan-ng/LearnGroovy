package com.techstack.basic

//byte
byte b = 10
println b
println Byte.MIN_VALUE
println Byte.MAX_VALUE
println "================"

//short
short s = 100
println s
println Short.MIN_VALUE
println Short.MAX_VALUE
println "================"

//int
int i = 1000
println i
println Integer.MIN_VALUE
println Integer.MAX_VALUE
println "================"

//long
//long l = 100000
long l = 100000L
println l
println Long.MIN_VALUE
println Long.MAX_VALUE
println "================"

//float
//float f = 100.002
float f = 100.002F
println f
println Float.MIN_VALUE
println Float.MAX_VALUE
println "================"

//double
//double d = 1000.00002
double d = 1000.00002D
println d
println Double.MIN_VALUE
println Double.MAX_VALUE
println "================"

//Boolean
boolean flag = true
println flag
println "================"

//char
char c = 'A'
//char c = 'Abc'
println c
println "================"

//String
String str = "Groovy"
println str
println "================"

//Using def to find the current DataType
def de = 10
println de
println de.getClass().getName()
println "================"

//How to cast value to target type
def de1 = (byte) 10
println de1
println de1.getClass().getName()
println "================"