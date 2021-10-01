package com.peopletech.session;

import java.util.HashMap;
import java.util.Map;

public class SampleMapDemo {

	public static void main(String[] args) {
		Map<Integer,Member> members=new HashMap<Integer,Member>();
		members.put(234,new Member("kumar","kumar@gmail.com","123456799"));
		members.put(245,new Member("naresh","naresh@gmail.com","123456797"));
		members.put(234,new Member("santhosh","santhosh@gmail.com","1234567997"));
	
	System.out.println(members);
	}
}
class Member{
	private String name;
	private String email;
	private String mobile;
	public Member(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", mobile=" + mobile + "]\n";
	}
	
}
