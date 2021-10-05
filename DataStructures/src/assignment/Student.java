package assignment;

public class Student {
 private int rollno;
 private String name;
 private String Stream;
 Student next;
public Student(int rollno, String name, String stream) {
	super();
	this.rollno = rollno;
	this.name = name;
	Stream = stream;
}
public Student() {
	super();
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return Stream;
}
public void setStream(String stream) {
	Stream = stream;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", Stream=" + Stream + "]";
}
 
 
}
