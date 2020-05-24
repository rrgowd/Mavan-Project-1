package Oops

class StudentClass {

	String name;
	int sub1mks;
	int sub2mks;
	
	def printTotal() {
		println "$name has total marks = "+(sub1mks+sub2mks)
	}
		
	static void main(args) {
		
  StudentClass student1 = new StudentClass()
  student1.name = "John"
student1.sub1mks = 88
student1.sub2mks = 95
student1.printTotal()

StudentClass student2 = new StudentClass()
student2.name = "moto"
student2.sub1mks = 100
student2.sub2mks = 95
student2.printTotal()

StudentClass student3 = new StudentClass()
student3.name = "moto"
student3.sub1mks = 100
student3.sub2mks = 94
student3.printTotal()
	}
}
