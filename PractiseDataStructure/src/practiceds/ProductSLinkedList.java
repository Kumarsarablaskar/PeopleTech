package practiceds;

public class ProductSLinkedList {
  Product head;
 
  public static void add(ProductSLinkedList stock,Product new_product) {
	    
	if(stock.head==null)
		  stock.head=new_product;
	  else {
		  Product trav=stock.head;
		  while(trav.next!=null)
			  trav=trav.next;
		  trav.next=new_product;
	  }
  }
  public static void printlist(ProductSLinkedList stock) {
	  Product trav;
	  if(stock.head==null)
		  System.out.println("the list is empty");
	  else {
		  trav=stock.head;
		  while(trav!=null) {
			  System.out.print(trav);
			  trav=trav.next;
		  }
	  }
	  
  }
  public static void addFirst(ProductSLinkedList stock,Product new_product) {
	  if(stock.head==null)
		  stock.head=new_product;
	  else {
		  new_product.next=stock.head;
		  stock.head=new_product;
	  }
	  
  }
  public static void addLast(ProductSLinkedList stock,Product new_product) {
	  
  }
  public static void main(String[] args) {
	  ProductSLinkedList stocklist=new ProductSLinkedList();
      stocklist.add(stocklist, new Product(250, "Maggiee", 12));
      stocklist.add(stocklist, new Product(251, "Mage",45));
      printlist(stocklist);
      System.out.println("\n<---->");
      stocklist.addFirst(stocklist, new Product(255, "Appy Fizz", 35));
      printlist(stocklist);
      
  }
}
 class Product{
	 int barcode;
	 String pname;
	 int quantity;
	 Product next;
	public Product(int barcode, String pname, int quantity) {
		super();
		this.barcode = barcode;
		this.pname = pname;
		this.quantity = quantity;
		next=null;
	}
	@Override
	public String toString() {
		return "Product [barcode=" + barcode + ", pname=" + pname + ", quantity=" + quantity + "]\n";
	}
	 
 }