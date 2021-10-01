package com.peopletech.lab5;

import java.util.Scanner;

public class FullName {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  
        
        try{
            String firstName = "Kumar"; 
            String lastName = "";
            placeHolder(firstName, lastName);
        }
        catch(NameException e){
            System.out.println(e.fullNameException());
        }
        
        
        
    }
    
    static void placeHolder (String firstName, String lastName) throws NameException {
        if (firstName.isEmpty() || lastName.isEmpty()){
            throw new NameException();
        }
        else{
            System.out.println("Your name is :"+firstName+" "+lastName);
        }
    }
    
}

class NameException extends Exception{
    
    public String fullNameException(){
        return "errror please enter full name";
    }
    
}


