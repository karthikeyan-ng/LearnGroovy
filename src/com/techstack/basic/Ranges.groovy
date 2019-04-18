package com.techstack.basic

def range = 1..10
println range
println range.size()
println range.getFrom() + " to " + range.getTo()

assert range.from == 1
assert range.to == 10

println range.get(3) //get the element from 3rd index (starts from 0)
println range[3]

println range.contains(6)

println range.isReverse()

def range2 = range.subList(3, 7)
println range2.getFrom() + " to " + range2.getTo()

//iterate on a range
for(i in range) {
	println i
}

(1..10).each { i -> println "value = $i" }
range.each { i -> println "value = $i" }

println range.getClass()
println range instanceof java.util.List