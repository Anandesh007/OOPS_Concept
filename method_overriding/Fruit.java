class Apple extends Fruit{
	Apple(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat() {
		System.out.println("Name: "+name+", Taste: "+taste+", Size: "+size);
	}
}

class Orange extends Fruit{
	Orange(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat() {
		System.out.println("Name: "+name+", Taste: "+taste+", Size: "+size);
	}
}

public class Fruit{
	String name;
	String taste;
	String size;
	Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("Name: "+name+", Taste: "+taste+", Size: "+size);
	}
	public static void main(String[] args) {
		Fruit apple=new Apple("Apple","Sweet","Large");
		Fruit orange=new Orange("Orange","Sour","Small");
		apple.eat();
		orange.eat();		
	}
}

// Create a base class Fruit with name ,taste and size as its attributes.
// Create a method called eat() which describes the name of the fruit and its taste.
// Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent
// each fruit taste.
