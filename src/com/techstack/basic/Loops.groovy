package com.techstack.basic

//for loop
for(int i=1; i<5; i++) {
	println i
}

for(def i=1; i<5; i++) {
	println i
}

int i = 1
for(i; i<5; i++) {
	println i
}

//================================
//for in
for(a in 1..5) {
	println a
}

// iterate over a list
x = 0
for ( j in [0, 1, 2, 3, 4] ) {
	x += j
	println x
}

// iterate over a map
def map = ['abc':1, 'def':2, 'xyz':3]
for ( e in map ) {
	println e
	println e.key + " " + e.value
}

//================================
//while loop

int k = 1
while(k<5) {
	println k
	k=k+1	
}

//================================
//upto
1.upto(5) { println "$it" }

//================================
//times ==> 0..N 
5.times { println "$it" }

//================================
//step
1.step(10, 1) { println "$it" }