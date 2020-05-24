package com.secondyear.demo

def employee = [ 'name' : 'John', 
	'age' : '40' ,
	'city' : 'Hyderabad']
	
println employee

println employee.name

println employee['name']


println employee.get('age')

println employee.getAt('age')


println employee.size()


employee.put('area', 'kukatpally')

println employee

employee.containsKey('area')
employee.containsValue('kukatpally')

println employee.getClass()

def emp2 = employee.clone()

println emp2

println "$key : $value"

//employee.eachWithIndex key,value }





















