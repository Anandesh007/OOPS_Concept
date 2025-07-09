
class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	String authorDetails(){
		return "Authorname: "+name+",email: "+email+ " gender: "+gender;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int quantity){
		this.name=name;
		this.author=author;
		this.price=price;
		qtyInStock=quantity;
	}
	
	//Setter
	void setname(String name) {
		this.name=name;
	}

	void setprice(double price) {
		this.price=price;
	}
	
	void setquantity(int quantity) {
		qtyInStock=quantity;
	}
	
	//Getter
	String setname() {
		return name;
	}

	double setprice() {
		return price;
	}
	
	int setquantity() {
		return qtyInStock;
	}
	
	String bookDetails() {
		return "Bookname: "+name+"\nPrice: "+price+"\nQuantity: "+qtyInStock+"\n" + author.authorDetails();
	}
	
	
}
public class BookMain {
	public static void main(String[] args) {
		Author a=new Author("Valmiki","valmiki@123gmail.com",'M');
		Book b=new Book("Ramayanam",a,300,2);
		
		System.out.println(b.bookDetails());
		
	}

}

// Create a class Author with the following information. Member variables : name (String),
// email (String), and gender (char)
// Parameterized Constructor: To initialize the variables
// Create a class Book with the following information. Member variables : name (String),
// author (of the class Author you have just created), price (double), and qtyInStock (int)
// [Assumption: Each book will be written by exactly one Author]
// Parameterized Constructor: To initialize the variables Getters and Setters for all the
// member variables
// In the main method, create a book object and print all details of the book (including the author
// details).