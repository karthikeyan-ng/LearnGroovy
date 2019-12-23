# LearnGroovy
Groovy Language
---------------
 - Is a programming language
 - It has java like or java compatable syntax
 - Those who know java it's very easy to learn.
 
 http://groovy-lang.org/
 https://en.wikipedia.org/wiki/Apache_Groovy
 
 Apache Groovy is a powerful, optionally typed and dynamic language, with static-typing and static compilation capabilities, for the Java platform aimed at improving developer productivity thanks to a concise, familiar and easy to learn syntax.
 
 What is meant by dynamic language?
	https://en.wikipedia.org/wiki/Dynamic_programming_language
	Dynamic programming language, in computer science, is a class of high-level programming languages which, at runtime, execute many common programming behaviors that static programming languages perform during compilation. 
	
 Difference between static and dynamic language?
	https://stackoverflow.com/questions/20563433/difference-between-static-and-dynamic-programming-languages
	
How to install Groovy on Windows OS?
	Pre-requisite
		- Java should be installed 
	
	Download:
		https://groovy.apache.org/download.html
		
	Install:
		Simple and straigth forward instllation
	
	How to verify Goovy installed or not?
		cmd>groovy --version
		cmd>groovy -v
		cmd>where groovy
		
	Open Groovy console and start writing code and run.
		
		==> print "Hello World..."
		
IDE / Text editor Support:
	
	http://groovy-lang.org/ides.html
	
	Groovy plugin install on Eclipse:
		Step 1: https://github.com/groovy/groovy-eclipse/wiki
		Step 2: 
			1. Goto Eclipse IDE and add appropriate Groovy link for your IDD.
			2. Goto Eclipse IDE Marketplace
		Step 3: Restart
		Step 4: Verify Groovy is installed
		
Groovy Beginner Tutorial
	
	First Groovy program to print HelloWorld (MyFirstGroovyClass and MyFirstGroovyClass2)
		- Create a Groovy project
		- Create a Groovy class
		- Write code to print Hello World
		- Run the program
		- Run from command line
		- Basic Syntax
		- Comments
	
	Variables
		- How to define variables
		- How to name variables
		- Multiple assignments
		- Variables are used to store information. This information can be of diff type.
			eg. String, Number, Boolean
		
	DataTypes
		- Groovy has the following data types
			byte
			short
			int
			long
			float
			double
			Boolean
			char
			String
	
	Opertaors
		- Operators are symbols that tell the compiler to perform some specific opertaion
		
		Reference
		http://docs.groovy-lang.org/latest/html/documentation/core-operators.html
		
	Conditional Statements
		- Conditional Structure
			if-else
			switch-case
http://groovy-lang.org/semantics.html#_conditional_structures
		- Looping
http://groovy-lang.org/semantics.html#_looping_structures
			for
			for in
			while
			
			keywords
			--------
			upto
			times
			step
			
		- Exception Handling
http://groovy-lang.org/semantics.html#_exception_handling
			try-catch
			try-catch-finally
			try-finally
				

	Strings
		- single quoted '....'
		- double quoted "..."
		- triple single quoted '''....'''
		- triple double quoted """....."""
		- slashy /.../
		- doller slashy $/.../$
		
		
	Methods
		- What is a method?
			- named block of code
			- makes code modular and reusable
			- can take parameters
			- can have a return type
		- also called as functions
		- How to create a methods
		- Method parameters
		- Return type
		- Instance methods
		
		Ref: Methods.groovy and Methods1.groovy
		
	Closures
		- What are closures
		- How to use closures
		- Why do we need closures
		
		Closures: it is a block of code that can
			- take parameters
			- refer variables
			- can be passed as parameter in a method
			
		Ref: Google Search: What is the need of closures?
		https://medium.com/@dis_is_patrick/practical-uses-for-closures-c65640ae7304
		
	List
		- is a structure to store collection of data items
		syntax: [obj1, obj2, obj3, ... objN]
		exmple: 
			[1, 2, 3, 4]
			["java", "GoLang"]
			[1, 2, ['A', 'B'], 3]
			[1, 2, "Java", 2.2] ==> Hetrogenius List
			[] ==> empty list
 
	Maps
		- key-value pair
		- unordered collection
		syntex: [key : value, key : value]
		example: ['subject' : 'Groovy']
		[:] ==> empty map
	
	Ranges
		- creates a list of sequential values
		example: integer from 1 to 10	==> 1..10
				 char from a to z		==> 'a'..'z'
					
						OR 
				 reverse				==> 10..1
				 
		- two types
			- inclusive	==> 1..10
			- exclusive	==> 1..<10
			
	Input and Output
		Input:
			System.console().readLine()
		Output:
			- print
			- println
			- printf
			
	File IO | How to read Files
		1. How to read file as String
		2. How to read file as List
		3. How to read file as Array
		4. How to read file line by line
		5. How to delete file
	
	FileIO | How to write Files
		
		
	OOP | Classes & Objects
		Class - collection of data & methods that represent a real world object
		
		Source code ref: 
			.oop/Fruit
			.oop/Student
			.oop/Car
			.oop/CarObjects
		
	OOP | Inheritance and Method Overriding
		Is a process where one class acquires properties (methods and from other class)
		
		Parent	Child
		super	sub
		base	derived
		
		Animal -> Dog -> DogObjects
		Car -> Toyota
		
	OOP | Abstract Class
	OOP | Interface
	
	Regular Expressions
		https://regexr.com
		http://buildregex.com/
		
