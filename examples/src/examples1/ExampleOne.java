package examples1;

// Parent/base Class
class Animal {
	public void Hello() {
		System.out.println("The dog says hello.");
	}
}

//Child class
class Dog extends Animal {
	public void Hello() {
		System.out.println("Doggo goes woof!");
	}
}

class ExampleOne {
	public static void main (String[] args) {
		Animal animal1 = new Animal();
		Animal dog1 = new Dog();
		animal1.Hello();
		dog1.Hello();

	}

}
