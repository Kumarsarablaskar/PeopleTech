package practiseds.singlell;

public class ProductSlinkedList1 {
  Product1 head;
  public static void add(ProductSlinkedList1 stock,Product1 new_product1) {
	    
		if(stock.head==null)
			  stock.head=new_product1;
		  else {
			  Product1 trav=stock.head;
			  while(trav.next!=null)
				  trav=trav.next;
			  trav.next=new_product1;
		  }
	  }
	
  public static void printlist(ProductSlinkedList1 stock) {
	  Product1 trav;
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
  
  
  public static void removeAtIndex(ProductSlinkedList1 stock,int index) {
	  if(stock.head==null)
		 System.out.println("The List is Empty..");
	  else {
		  int i = 1;
		  Product1 temp=stock.head;
		  while(temp.next != null) {
			  if(i ==index-1) {
				  temp.next=temp.next.next;
				  break;
			  }
		  temp=temp.next;
		   i++;
				 
			
		  }
	  }
		 
  }
  public static void removeLast(ProductSlinkedList1 stock) {
	  if(stock.head==null)
			 System.out.println("The List is Empty..");
	  else {
		  Product1 temp = stock.head;
		  while(temp.next != null) {
			 temp=temp.next;
			 break;
		  }
		  temp.next=null;
	
	      }
	  }
  
  public static void main(String[] args) {
	  ProductSlinkedList1 stocklist=new ProductSlinkedList1();
      stocklist.add(stocklist, new Product1(250, "Maggiee", 12));
      stocklist.add(stocklist, new Product1(251, "apy",45));
      stocklist.add(stocklist, new Product1(150, "oreo", 1));
      stocklist.add(stocklist, new Product1(125, "snacks", 12));
      stocklist.add(stocklist, new Product1(100, "sticky",45));
      stocklist.add(stocklist, new Product1(255, "stocky", 1));
      printlist(stocklist);
      System.out.println("\n<---->");
      stocklist.removeAtIndex(stocklist, 3);
      printlist(stocklist);
      System.out.println("\n<---->");
      stocklist.removeLast(stocklist);
      printlist(stocklist);
    
      
     
	
}
}
class Product1{
	int barcode;
	String pname;
	int quantity;
	Product1 next;
	public Product1(int barcode, String pname, int quantity) {
		super();
		this.barcode = barcode;
		this.pname = pname;
		this.quantity = quantity;
		next=null;
		
	}
	@Override
	public String toString() {
		return "Product1 [barcode=" + barcode + ", pname=" + pname + ", quantity=" + quantity + "]\n";
	}
	
}
