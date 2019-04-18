package com.techstack.basic

def employee = ['name' : 'Karthi', 'age' : 35]

println employee //simply print

println employee.name //using key get the value from the map

println employee['name'] //another version: using key get the value from the map

println employee.get('age') //another version: using key get the value from the map

println employee.getAt('age') //another version: using key get the value from the map

println employee.size()

employee.put('city', 'Cologne')
println employee

println employee.containsKey('city')
println employee.containsValue('Cologne')

println employee.getClass()

def emp2 = employee.clone() //clone the employee map put it into new map called emp2
println emp2

//Iterate a map
employee.each { key, value ->
	println "$key : $value"
}

employee.eachWithIndex { key, value, i -> 
	println "$i | $key : $value"
}

employee.each { entry ->
	println "$entry.key : $entry.value"
}

employee.eachWithIndex { entry, index ->
	println "$index | $entry.key : $entry.value"
}

def map1 = ['a' : 1, 'b' : 2]
def entries = map1.entrySet()
entries.each { entry ->
	assert entry.key in ['a', 'b']
	assert entry.value in [1, 2]
}

employee.clear()
println employee
