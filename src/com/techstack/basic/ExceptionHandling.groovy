package com.techstack.basic

// basic - to get exception
//int i = 1/0

try {
//	int i = 1/0
	int i = 1/1
} catch(ArithmeticException ex) {
	println "ArithmeticException occurs"
} catch(Exception ex) {
	println "Exception occurs"
	println ex.getMessage()
	//ex.printStackTrace()
} finally {
	println "Inside finally block"
}


try {
	int i = 1/1
} finally {
	println "Inside finally block1"
}

try {
/* ... */
} catch ( IOException | NullPointerException e ) {
/* one block to handle 2 exceptions */
}

println "Another execution line"