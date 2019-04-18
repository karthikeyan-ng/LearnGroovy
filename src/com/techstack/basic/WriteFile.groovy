package com.techstack.basic

File myFile = new File("data4.txt")

myFile.write("This is Line 1")
myFile << "\nThis is Line 2"

//myFile.text = "This is Line 3" //it will override existing content

myFile.withWriter { writer ->
	writer.writeLine("This is Line 4")	//This will also overrider existing content
}
myFile.append("This is Line 5")

println myFile.length()
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()

println myFile.text

//copy/push data to new file
def newFile = new File("data5.txt")
newFile << myFile.text 

//clear the data from the file
myFile.bytes = []

myFile.renameTo(new File("newFile.txt"))

myFile.delete()