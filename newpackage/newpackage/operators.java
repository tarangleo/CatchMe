package newpackage.newpackage; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author taran
 */



public class operators {
     /*
    static int divideByZero(int a,int b)
    {
        int i=a/b;
        return i;
    }
    */ 
    
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Value of a :");

        int a = myObj.nextInt(); 
        System.out.println("Enter Value of b :");

        int b = myObj.nextInt();
        
        System.out.println(a+b);
        System.out.println(a-b);
        try
        {
            //int i = a/b;
            System.out.println(a/b);
        }
        catch(ArithmeticException t)
        {
            System.out.println("Exception Found!!!!");
        }
        System.out.println(a*b);

    
    }
    
}
