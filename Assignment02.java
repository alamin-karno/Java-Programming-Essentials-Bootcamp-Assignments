/*
Write a function that returns the sum of two integers. 
*/


import java.util.Scanner; 

public class Assignment02{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        
        System.out.println();
        
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        
        int result = getSum(num1,num2);
        
        System.out.println("Sum of two number is: "+result);
        
     }
     
     
     static int getSum(int num1, int num2){
         return num1 + num2;
     }
}
