package com.peopletech.lists1;

public class LinkedListEmp {
  Employee head;
  static int size=0;
  public static LinkedListEmp insert(LinkedListEmp list,int id,String name,double salary) {
	 Employee new_emp=new Employee(id,name,salary);
	 if(list.head==null)
		 list.head=new_emp;
	 else {
		 Employee trav=list.head; 	 
	 while(trav.next!=null) {
		 trav=trav.next;
	 }
	 trav.next=new_emp;
	 }
	 return list;
	 }
  public static void printList(LinkedListEmp list) {
	  Employee curr=list.head;
	  System.out.println("Linked List: ");
	  while(curr!=null) {
		  System.out.print(curr.id+" "+curr.name+" "+curr.salary+" "+"-->");
		  curr=curr.next;
	  }
  }
  public void addFirst(LinkedListEmp list,int id,String name ,double salary ) {

      Employee emp=new Employee(id, name, salary);
        if(list.head==null)
            list.head=emp;
        else
        {
            emp.next=list.head;
            list.head.prev=emp;
            list.head=emp;


        }
        size++;


    }
  public static LinkedListEmp remove(LinkedListEmp list,int id,String name,double salary) {
	  if(list.head==null)
		  System.out.println("The List is Empty..");
	  else {
		  Employee curr=list.head;
		  Employee curr2=curr.next;
		while(curr2.next!=null) {
			if(curr2.id==id) {
				System.out.println();
				Employee temp=curr2;
				curr.next=curr2.next;
				temp=null;
				break;
			}
			curr=curr2;
			curr2=curr2.next;
		}
	  }
	return list;
	  
  }
  public void removeFirst(LinkedListEmp list) {
      if (list.head == null) {
          System.out.println("list is already empty");
      }
      else {
         Employee curr = list.head;
          list.head = curr.next;
          curr.next = null;
      }
  }
  public void removeLast(LinkedListEmp list) {
      if (list.head == null) {
          System.out.println("list is already empty");
      }
      else {
          Employee temp = list.head;
          while(temp.next != null) {
              temp = temp.next;
          }
          temp.next = null;
      }
  }
  public static void main(String[] args) {
	  LinkedListEmp k=new LinkedListEmp();
	  k.insert(k, 585, "kumar", 24500.8);
	  k.insert(k, 235, "shreyas", 18020.4);
	  k.insert(k, 950, "naresh", 70693.9);
	  k.insert(k, 795, "teja", 36000.2);
	  
	  printList(k);
	  System.out.println("\n<--------remove--------->");
	  k.remove(k, 235, "shreyas", 18020.4);
	  printList(k);
      System.out.println("\n --------add first--------");
      k.addFirst(k,125,"raghu",50232.01);
      printList(k);
      System.out.println("\n --------remove last--------");
      k.removeLast(k);
      printList(k);
      System.out.println("\n --------remove first--------");
      k.removeFirst(k);
      printList(k);
}
  
}

class Employee{
	int id;
	String name;
	double salary;
	Employee next;
	Employee prev;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.next=null;
	}
	
}