package com.techstack.basic

def fruits = ["Apple", "Orange", "Grapes"]	//index starts from 0

println fruits[1]
println fruits.get(2)

def myList = [1, 2, 3, ['A', 'B', "Groovy"], 4]	//==>Heterogeneous List
println myList[2]
println myList[3]
println myList[3][2] //==>from index 3, it's another list get 2nd element
println myList.get(3).get(2) //==> another version of line 11

println myList[0..2] //==>access elements from index 0 until index 2
println myList[4..2] //==>getting elements from the backwards

println myList.contains(2)

println myList.contains("Groovy") //==>false; because Groovy is an item which is inside another item.
println myList[3].contains("Groovy") //==>true

println myList.size()
println myList[3].size() //==>internal list size

myList.add(10)
println myList

myList<<20	//==>simpler form of "add" method
println myList

myList.add(2, 25) //add element to the specific index
println myList

myList.remove(2)
println myList

myList = myList + [30, 40] //another version of adding elements to list
println myList

myList = myList.plus([50])
println myList

myList = myList - [30, 40]	//remove elements from a list
println myList

myList = myList.minus([50])
println myList

myList.pop()	//removes the 1st element from the list
println myList

myList.removeLast()
println myList

println myList.intersect([1,2,3]) //elements which is matched in both the lists

println myList.reverse()

println myList.sort()

println myList.isEmpty()

myList.clear()
println myList


