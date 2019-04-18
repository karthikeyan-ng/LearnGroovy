package com.techstack.basic

/* reading files */

//String filePath = "data1.txt"
String filePath = "M:/STSWorkspace/MyFirstGroovyProject/data1.txt"	//Absolute path
File myFile = new File(filePath)

//reading entire content as String
println myFile.text

//collect lines into a list
def list = myFile.collect{ it }
println list

//store file content in an array
def array = myFile as String[]
println array

//read file into a list of String
def lines = myFile.readLines()
println lines

//read file line by line
myFile.eachLine { line -> 
	println "line : $line"
}

//read file line by line with line number
myFile.eachLine { line, lineNo ->
	println "$lineNo : $line"
}

//Filter lines based on line number
def lineNoRange = 2..4
def lineList = []
myFile.eachLine { line, lineNo ->
	if(lineNoRange.contains(lineNo)) {
		lineList.add(line)
	}
}
println lineList

//read with reader
def line
myFile.withReader { reader -> 
	while((line = reader.readLine()) != null) {
		println line
	}
}

//until this, file stream will be closed automatically

//reading with new reader
	//new reader will open file after the operation
def outputFile = "data2.txt"
def reader = myFile.newReader()
new File(outputFile).append(reader)
reader.close()

//when working with binary files, read content as bytes
byte[] contents = myFile.bytes
println contents

//size in bytes
println myFile.length()

//check if is a file or directory
println myFile.isFile()
println myFile.isDirectory()

//get list of files from a dir
new File("C:/Users/Kriishanth/Downloads/5").eachFile { 
	files -> println files.getAbsolutePath()
}

//recursively display all files in a dir & its sub-dir
new File("C:/Users/Kriishanth/Downloads/Wipro Documents Submission/documents").eachFileRecurse {
	files -> println files.getAbsolutePath()
}

//copy file data to another file
def newFile = new File("data3.txt")
newFile << myFile.text	//<< means left shift

//delete file
newFile.delete()