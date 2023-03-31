/* 
 Write a function that takes a positive integer n and returns the sum of all integers from 1 to n.
*/


import java.util.Scanner; 

public class Assignement03{

     public static void main(String []args){
         
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        
        sc.close();
        
        if(number >= 0){
            int result = sum(number);
            System.out.println("Sum of all integer: "+ result);
        }
        else{
            System.out.println("You have enter negetive number");
        }
        
        
     }
     
     public static int sum(int n) {
         int sum = 0;
         
         for (int i = 1; i <= n; i++) {
             sum += i;
             
         }
         
         return sum;
}
}
