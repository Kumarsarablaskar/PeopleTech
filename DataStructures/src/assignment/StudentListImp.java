package assignment;

public class StudentListImp {
	Student head;

	//add
	public void add(StudentListImp list , Student newData) {
	if(head == null) {
	head = newData;
	}
	else {
	Student curr = list.head;
	while(curr.next != null) {
	curr = curr.next;
	}
	curr.next = newData;
	}
	}

	//print
	public void print(StudentListImp list) {
	if(head == null) {
	System.out.print("empty list");
	}
	else {
	Student temp = head;
	while(temp!=null) {
	System.out.print(temp+" --> ");
	temp = temp.next;
	}
	System.out.println("\n");
	}
	}


	//get
	public void get(StudentListImp list, int get) {
	int i=1;
	if(head == null) {
	System.out.print("empty list");
	}
	else {
	Student temp = head;

	while(temp!=null) {
	if(i == get) {
	System.out.println(temp);
	}
	temp = temp.next;
	i++;
	}
	}
	}

	//get first
	public void getFirst(StudentListImp list) {
	if(head == null) {
	System.out.print("empty list");
	}
	else {
	Student temp = head;
	System.out.println(temp);
	}
	}
	 
	//get last
	public void getLast(StudentListImp list) {
	if(head == null) {
	System.out.print("empty list");
	}
	else {
	Student temp = head;
	while(temp.next != null) {
	temp = temp.next;
	}
	System.out.println(temp);
	}
	}

	//get last index
	public void getLastIndex(StudentListImp list) {
	int index = 1;
	if(head == null) {
	System.out.print("empty list");
	}
	else {
	Student temp = head;
	while(temp.next != null) {
	temp = temp.next;
	index++;
	}
	System.out.println("The last index is : "+ index+" of student "+temp);

	}
	}

	//contains
	public boolean contains(StudentListImp list, Student s)
    {
        if(head == null)
        {
            return false;
            }
        else
        {
            Student temp = head;
            while(temp.next != null)
            {
                if(temp.equals(s))
                {
                    return true;
                    }
                temp = temp.next;
                }
            }
        return false;
        }
	 
	public static void main(String[] args) {

	StudentListImp k = new StudentListImp();
	k.add(k, new Student(265, "KUMAR", "ECE"));
	k.add(k, new Student(985,"TEJA","CIVIL"));
	k.add(k, new Student(458,"NARESH","CS"));
	k.add(k, new Student(943,"AKHIL","AI"));
	k.add(k, new Student(195,"SHREYAS","MECH"));

	k.print(k);
	System.out.println("get method");
	k.get(k, 3);
	System.out.println("get first");
	k.getFirst(k);
	System.out.println("get last");
	k.getLast(k);
	System.out.println("get last index");
	k.getLastIndex(k);
	System.out.println("\nData Contains: ");
    System.out.println(k.contains(k, new Student(195,"SHREYAS","MECH")));

	}
	 
	}

