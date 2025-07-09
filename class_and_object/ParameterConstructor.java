import java.util.Scanner;

class Box{
	int height;
	int width;
	int depth;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int volumeOfBox() {
		int volume=height*width*depth;
		return volume;
	}
}
public class ParameterConstructor {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the width, height and depth");
	int width=sc.nextInt();
	int height=sc.nextInt();
	int depth=sc.nextInt();
	Box b=new Box(width,height,depth);
	System.out.println("The volume of the box is:"+b.volumeOfBox());
	sc.close();
	}
}

// Create a class Box that uses a parameterized constructor to initialize the dimensions of
// a box.The dimensions of the Box are width, height, depth. The class should have a method
// that can return the volume of the box. Create an object of the Box class and test the
// functionalities.