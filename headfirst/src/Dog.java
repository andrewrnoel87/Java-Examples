class Dog {

	int size;
	String breed;       // instance variables
	String name;
	
	void bark() {                                 // a method
		System.out.println("Ruff! Ruff!");
	}
}

class DogTestDrive {
	public static void main (String[] args) {
		Dog d = new Dog();                      // make a Dog object
		d.size = 40;                    // use the dot operator (.) to set the size of the Dog
		d.bark();      		// call its bark() method
		System.out.println(d.size);
	}
}
	