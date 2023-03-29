/*
Write a Java program that prompts the user to enter a number
and determines whether the number is positive or negative. 
If the number is positive, the program should print "The 
number is positive." If the number is negative, the program 
should print "The number is negative."
*/


import java.util.Scanner;

public class Assignment01{

     public static void main(String []args){
         
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        sc.close();
        
        System.out.println("");
        
        if(number > 0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }
        
     }
}
