abstract class LibraryItem{
	private String name;
	public LibraryItem(String name){
		this.name = name;
	}
	public String getItemName(){
		return name;
	}
	public abstract String getType();
}

class Book extends LibraryItem{
	private String type = "Book";
	public Book(String name){
		super(name);
	}
	public String getType(){
		return type;
	}
}

class Journal extends LibraryItem{
	private String type = "Journal";
	public Journal(String name){
		super(name);
	}
	public String getType() {
		return type;
	}
}

class Borrower{
	private String name;
	public Borrower(String name){
		this.name = name;
	}
	public String getUserName(){
		return name;
	}
}

abstract class Library{
	public abstract void borrowItem(LibraryItem item, Borrower borrower);
	public abstract void returnItem(LibraryItem item);
}

class ConcreteLibrary extends Library{
	public void borrowItem(LibraryItem item, Borrower borrower){
		System.out.println(item.getType() + " " +  item.getItemName() + " have been borrowed by " + borrower.getUserName());
	}
	public void returnItem(LibraryItem item){
		System.out.println(item.getType() + " " + item.getItemName() + " have been returned.");
	}
}

abstract class LibraryDecorator extends Library{
	protected Library lib;
	public LibraryDecorator(Library lib){
		this.lib = lib;
	}
	public void borrowItem(LibraryItem item, Borrower borrower) {
		lib.borrowItem(item, borrower);
	}
	public void returnItem(LibraryItem item) {
		lib.returnItem(item);
	}
}

class CountingLibrary extends LibraryDecorator{
	private int counter = 0;
	public CountingLibrary(Library lib){
		super(lib);
	}
	public void borrowItem(LibraryItem item, Borrower borrower){
		this.lib.borrowItem(item, borrower);
		counter++;
		this.printItemsCounter();
	}
	public void returnItem(LibraryItem item){
		this.lib.returnItem(item);
		counter--;
		this.printItemsCounter();
	}
	private void printItemsCounter(){
		System.out.println("the library has been borrowed " + counter + " items");
	}
}

class SellingLibrary extends LibraryDecorator{
	public SellingLibrary(Library lib) {
		super(lib);
	}

	public void sellItem(LibraryItem item) {
		System.out.println(item.getType() + " " + item.getItemName() + " has been selled");
	}
}

public class Decorator{
  public static void main(String[] args){
  	    Borrower borrower = new Borrower("Lindz");
 		LibraryItem book = new Book("Harry potter");
 		LibraryItem journal = new Journal("Day night");

 		Library lib = new ConcreteLibrary();
 		CountingLibrary clib = new CountingLibrary(lib);
 		SellingLibrary slib = new SellingLibrary(clib);

 		slib.borrowItem(book, borrower);
 		slib.returnItem(book);
 		slib.sellItem(journal);

  }
}
