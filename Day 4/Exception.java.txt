import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 public static void main(String[] args) {
    
     try{
          Scanner sc = new Scanner(System.in);
          int div;
          int x = sc.nextInt();
           int y= sc.nextInt();
          div =x/y;
         System.out.println(div);
       }catch(ArithmeticException e){
           System.out.println("java.lang.ArithmeticException: / by zero");
       
    } 
     catch(InputMismatchException in){
           System.out.println("java.util.InputMismatchException");
       }
   }
}
