package com.peopletech.doublylist2;

import java.util.Objects;

class Student{
	private int id;
	private String name;
	private String branch;
	public Student next;
	public Student prev;
	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", next=" + next + ", prev=" + prev
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, id, name, next, prev);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(branch, other.branch) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(next, other.next) && Objects.equals(prev, other.prev);
	}

	public Student getNext() {
		return next;
	}

	public void setNext(Student next) {
		this.next = next;
	}

	public Student getPrev() {
		return prev;
	}

	public void setPrev(Student prev) {
		this.prev = prev;
	}

	
	
	
}
