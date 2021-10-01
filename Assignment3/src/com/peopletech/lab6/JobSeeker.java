package com.peopletech.lab6;

public class JobSeeker {
 public static boolean validateChar( int count) {
  if(count>=8){
  return  true;
  }
  else
  return false;
 }
  public static void main(String[] args) {
    int count=0;
    String userName="kumar";
    String job="_job";
    String jobApp=userName+job;
    System.out.println(jobApp);
    for(int i=0;i<userName.length();i++) {
      if(userName.charAt(i)!=' ') {
        count++;
      }
    }
    System.out.println( validateChar(count));
  }

}