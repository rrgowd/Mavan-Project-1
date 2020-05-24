package com.secondyear.demo

class Fruits {
	
	private String name
	private String fruitColor
	
	def setFruitName(String name) {
		fruitName = name
	} 
	
	def setFruitColor(String color) {
		fruitColor = color
	}
		
	def getfruitName() {
		println "name of the fruit is $fruitName"
	}
	
	def getfruitColor() {
		println "name of the fruit is $fruitColor"
	}
	
	static void main(args) {
		
		Fruits apple = new Fruits()
		apple.setFruitName("Apple")
		apple.setFruitColor("Red")
		
		apple.getfruitColor()
		apple.getfruitColor()		
	}
}
