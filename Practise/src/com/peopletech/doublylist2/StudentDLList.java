package com.peopletech.doublylist2;

public class StudentDLList {
	 
	    Student head;
	    static int size=0;
	    // Adding Element to the End of the List
	    public static void add(StudentDLList list , Student newStudent)
	    {
	        if(list.head==null)
	            list.head=newStudent;
	        else
	        {
	            Student curr=list.head;

	            while(curr.next!=null)
	                curr=curr.next;
	            curr.next=newStudent;
	            newStudent.prev=curr;
	        }
	        size++;
	    }
	    public static Student get(StudentDLList list,int index)
	    {
	        Student s=null;
	        if(index>size)
	            System.out.println("Invalid Index..");
	        else
	        {
	            int temp=1;
	            s=list.head;
	            while(s.next!=null)
	            {
	                s=s.next;
	                temp++;
	                if(temp==index)
	                    break;
	            }

	        }
	        return s;
	    }
	    public static void printList(StudentDLList list)
	    {
	        Student curr=list.head;
	        if(list.head==null)
	            System.out.println("List is Empty...");
	        else
	        {
	            while(curr!=null)
	            {
	                System.out.print(curr+" <-> ");
	                curr=curr.next;
	            }

	        }
	        System.out.println("\nList in reverse order\n");
	        Student s=get(list,size);
	        while(s!=null)
	        {
	            System.out.print(s+" <-> ");
	            s=s.prev;
	        }    
	    }
	    public static void main(String[] args) {
	        StudentDLList list=new StudentDLList();
	        list.add(list, new Student(12,"Neelkanth","CS"));
	        list.add(list, new Student(34,"Uttam","IT"));
	        list.add(list, new Student(71,"Gargesh","EEE"));
	        list.add(list, new Student(62,"Tanisha","ECE")); 
	        list.add(list, new Student(86,"Kanak","CS"));

	        printList(list);

	        System.out.println("\nElement at index 2 : "+get(list,2));
	    }
	 
	}

