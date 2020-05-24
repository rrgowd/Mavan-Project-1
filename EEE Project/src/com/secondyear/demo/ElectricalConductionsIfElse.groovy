package com.secondyear.demo



//def num = 11
//if (num == 10) //{} are optional
//
//	println "num is 10"
//else 
	//println "num is NOT 10"


// chack number is +ve Or -nv

//def num = 11
//if (num < 0)
//	println "num is +ve"
//else
//	println "num is -ve"

//	def num = 111
//	if (num < 0)
//		println "num is +ve"
//		else if (num == 11)
//			println "num is zero"
//	else
//		println "num is -ve"


//switch-case

def x = 0.01

def result = ""

switch(x) {
case 0:
result = "x is zero"

break 
case {x>0}:
result = "x is +ve"

break
case {x<0}:
result = "x is -ve"
default:
result = "Invalid number"
}
println result
	
