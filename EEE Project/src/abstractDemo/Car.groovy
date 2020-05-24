package abstractDemo

abstract class Car {
	String name;
	String color;
	int model;
	
	def startEngine() {
		println "eng std for $naame"
	}
	abstract def topSpeed();
	
}
