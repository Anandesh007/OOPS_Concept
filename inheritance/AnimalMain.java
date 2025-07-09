
class Animal{
	void eat() {
		System.out.println("It is eating");
	}
	void sleep() {
		System.out.println("It is sleeping");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Birds are eating");
	}
	void sleep() {
		System.out.println("Birds are sleeping");
	}
	void fly() {
		System.out.println("Birds are flying");
	}
}
public class AnimalMain {
	public static void main(String[] args) {
		Animal obj1=new Animal();
		Bird obj2=new Bird();
		obj1.eat();
		obj1.sleep();
		obj2.eat();
		obj2.sleep();
		obj2.fly();
	}
}

// Create a class named ‘Animal’ which includes methods like eat() and sleep().
// Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new
// method named fly().
// Create an instance of Animal class and invoke the eat and sleep methods using this object.
// Create an instance of Bird class and invoke the eat, sleep and fly methods using this object