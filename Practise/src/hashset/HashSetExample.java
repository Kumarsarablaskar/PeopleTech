package hashset;

import java.util.HashSet;

public class HashSetExample {
   public static void main(String[] args) {
	HashSet<Book> set=new HashSet<Book>();
	//Creating Books
	Book b1=new Book(101,"C","Yashwant kanetkar","BPB",8);
	Book b2=new Book(102,"Data communication","Forouzan","Mc Graw Hill",4);
	Book b3=new Book(103,"Operating System","Galyin","wiley",6);
	Book b4=new Book(103,"Operating System","Galyin","wiley",6);
	Book b5=new Book(101,"C","Yashwant kanetkar","BPB",8);
	//Adding Books to HashSet
	set.add(b1);
	set.add(b2);
	set.add(b3);
	//Traversing HashSet
	for(Book b:set) {
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	
}
}
