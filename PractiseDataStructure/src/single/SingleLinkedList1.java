package single;

public class SingleLinkedList1 {
 Student head;
 public static SingleLinkedList1 insert(SingleLinkedList1 stud, int rollno,String name,String address) {
	 Student new_student=new Student(rollno,name,address);
	 if(stud.head==null)
	  stud.head=new_student; 
	  else {
		  Student trav=stud.head;
		  while(trav.next!=null) {
			  trav=trav.next;
		  }
		  trav.next=new_student;
	  }
	 return stud;	 
 }
 
 public static void printList(SingleLinkedList1 stud) {
	 Student curr=stud.head;
	 System.out.println("Linked List:");
	 while(curr!=null) {
		 System.out.println(curr.rollno+"---->"+curr.name+"---->"+curr.address);
		 curr=curr.next;
	 }
 }
 public static SingleLinkedList1 removeFirst(SingleLinkedList1 stud,int rollno,String name,String address) {
	 Student student=new Student(rollno, name, address);
	 if(stud.head==null)
		 System.out.println("The list is Empty...");
	 else {
		 Student curr=stud.head;
		 Student curr1=curr.next;
		if(curr.rollno==rollno);
		 Student temp=stud.head;
		 stud.head=stud.head.next;
		 temp=null;
	 
		{
			 while(curr1.next!=null) {
			 if(curr1.rollno==rollno) {
				System.out.println(curr1.rollno+"=="+rollno);
				curr1.next=curr1.next;
				curr1=null;
				break;
			 }
			 curr=curr1;
			 curr1=curr1.next;
		 }
			 
		 
	 }
	}
	return stud;
 }
 public static SingleLinkedList1 remove(SingleLinkedList1 stud,int rollno,String name,String address) {
	if(stud.head==null)
		System.out.println("The List is Empty..");
	
	return stud;
	 
 }
 public static void main(String[] args) {
	 SingleLinkedList1 stud1=new SingleLinkedList1();
	 stud1.insert(stud1, 25, "Kumar", "Hyd");
	 stud1.insert(stud1, 26, "Naresh", "Nzb");
	 stud1.insert(stud1, 27, "Teja", "Wrgl");
	 printList(stud1);
	 stud1.removeFirst(stud1, 25, "Kumar", "Hyd");
	 printList(stud1);
}
}
