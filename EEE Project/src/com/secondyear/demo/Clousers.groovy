package com.secondyear.demo


def str = "Hello "

def myClosure1 = {name -> println "$str $name" }

myClosure1.call("Rakesh")



def myMethod(clos) {
	clos.call("Groovy")
	
}

myMethod(myClosure1)


def myClosure2 = {
	a,b,c ->
	return (a+b+c)
}

def res = myClosure2(10,20,30)

println res

def mylist = ["apples , oranges, grapes"]

println mylist.each { it 
	}

	
	def myMap = [
		'subjet' : 'groovy',
		'topic'  : 'closures'
			]
	println myMap.each { it }
	
	def mymap1 = [1,2,3,4,5,6]
	
	println mymap1.find { item -> item == 3
		}
	
println mymap1.findAll { item -> item > 3
}			
	
println mymap1.any {item -> item > 5	
}
	
println mymap1.every {item -> item > 3 }
	

println mylist.collect { item ->  item*2 }











	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	








