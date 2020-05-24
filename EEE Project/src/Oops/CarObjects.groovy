package Oops

class CarObjects {

	static void main(args) {
		Car toyorta = new Car()
		Car ford = new Car ()
		Car bmw = new Car ()
		
		toyorta.name = "Toyorta"
		toyorta.model = 2019
		toyorta.color = "Red"
				
		ford.name = "Ford"
		ford.model = 2018
		ford.color = "Yello"
				
		bmw.name = "BMW"
		bmw.model = 2019
		bmw.color = "white"
		
		toyorta.getCarDetails()
		toyorta.startEngine()
		println("========================")
		
		ford.getCarDetails()
		ford.startEngine()
		println("========================")
		
		bmw.getCarDetails()
		bmw.startEngine()
		println("========================")
	}
}
