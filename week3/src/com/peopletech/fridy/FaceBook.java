package com.peopletech.fridy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FaceBook {
  public static void main(String[] args) {
	HashMap<User,List<Friends>>users=new HashMap<User,List<Friends>>();
    User u1=new User("kumar", 123456789, "kumar@email");
    User u2=new User("naresh", 123456779, "naresh@email");
    User u3=new User("santhosh", 13246789, "santhosh@email");
    
    Friends f1=new Friends("teja",3456789, "teja@email");
    Friends f2=new Friends("pankaj",1456789, "pankaj@email");
    Friends f3=new Friends("subhodh",56789, "subhodh@email");
    
    List<Friends> frnd1=new ArrayList<Friends>();
    frnd1.add(f1);
    frnd1.add(f2);
    frnd1.add(f3);

    List<Friends> frnd2=new ArrayList<Friends>();
    frnd2.add(f1);
    frnd2.add(f2);


    List<Friends> frnd3=new ArrayList<Friends>();
    frnd3.add(f1);
    
    fac.put(u1, f1);
    users.put(u2, f2);
    users.put(u3, f3);
    System.out.println(users);
  }
}
