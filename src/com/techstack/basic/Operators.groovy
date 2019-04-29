package com.techstack.basic

//Arithmetic operators
//Normal artichmetic operators
// + - * / % **

/**
 * assert is a statement where it will evaluate LHS = RHS
 */
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8	//** means power 2^3
//integer devision ==> intdiv()
assert 9.intdiv(5) == 1

assert 2.2.plus(1.1) == 3.3

//========================================

//Unary operators
assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

//========================================

//Increment ++ and Decrement --
int i = 10
println i++	//Post increment
println i

def a = 2
def b = a++ * 3
assert a == 3 && b == 6

def c = 3
def d = c-- * 2
assert c == 2 && d == 6

def e = 1
def f = ++e + 3
assert e == 2 && f == 5

def g = 4
def h = --g + 1
assert g == 3 && h == 4

//========================================

//Assignment arithmetic operators
// += -= *= /= %= **=

def a1 = 4
a1 += 3	//a1 = a1 + 3
assert a1 == 7

def b1 = 5
b1 -= 3
assert b1 == 2

def c1 = 5
c1 *= 3
assert c1 == 15

def d1 = 10
d1 /= 2
assert d1 == 5

def e1 = 10
e1 %= 3
assert e1 == 1

def f1 = 3
f1 **= 2
assert f1 == 9

//========================================
//Relational operators
// == != < <= > >= 

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//========================================
//Logical operators
// && || !

assert !false
assert true && true
assert true || false

//Precedence
//The logical "not" has a higher priority than the logical "and".
assert (!false && false) == false

//The logical "and" has a higher priority than the logical "or".
assert true || true && false

//========================================
//Bitwise operators
// & (and) | (or)  ^ (xor - excludsive or) ~ (negation)
int val1 = 20
int val2 = 25
println (a & b)
println Integer.toBinaryString(20)	// 10100
println Integer.toBinaryString(25)  // 11001
									// 10000
println Integer.parseInt("10000", 2)	

int a3 = 0b00101010
assert a3 == 42
int b3 = 0b00001000
assert b3 == 8
assert (a3 & a3) == a3
assert (a3 & b3) == b3
assert (a3 | a3) == a3
assert (a3 | b3) == a3

int mask = 0b11111111
assert ((a3 ^ a3) & mask) == 0b00000000
assert ((a3 ^ b3) & mask) == 0b00100010
assert ((~a3) & mask)    == 0b11010101

//========================================
//Conditional operators

	//Not operator
assert (!true)    == false
assert (!'foo')   == false	//Not null
assert (!'')      == true	//Not null

	//Ternary operator
def value = 18
println value >= 18 ? "eligible for vote" : "not eligible for vote"

	//Elvis operator
println value >= 18 ?: "not eligible for vote"

//========================================
// Some advance operator available which we will discuss later

