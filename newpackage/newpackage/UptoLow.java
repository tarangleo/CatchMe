/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package newpackage.newpackage;



import java.util.*;
/**
 *
 * @author taran
 */
class uppertolower
{
    
    String str ;
    String strCopy1;
    String strCopy2 ;
    void getstring()
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a string: ");
        str= sc.nextLine();
    }
    void changelowtoup()
    {
        int i=0;
        strCopy1= str;
        while(i<strCopy1.length())
        {
            if(strCopy1.charAt(i)>=97)
            {
                
                char ch = (char)((int)strCopy1.charAt(i) - 32);
                strCopy1 = strCopy1.substring(0, i) + ch
                      + strCopy1.substring(i + 1);
              
            }
            i++; 
        }
    }
    void changevlowtoup()
    {
        int i=0;
        char[] arr={'a','e','i','o','u'};
        strCopy2= str;
        while(i<strCopy2.length())
        {
            for (char element : arr) 
            {
            
        
                if(strCopy2.charAt(i)==element)
                {
                
                    char ch = (char)((int)strCopy2.charAt(i) - 32);
                    strCopy2 = strCopy2.substring(0, i) + ch
                          + strCopy2.substring(i + 1);
                
                }
            }
            i++; 
        }
    }
    void printStringlowtoup()
    {
       System.out.print(strCopy1); 
    }
    void printStringvlowtoup()
    {
       System.out.print(strCopy2); 
    }
}

public class UptoLow 
{
    public static void main(String args[])
    {
        uppertolower l1=new uppertolower();
        l1.getstring();
        l1.changelowtoup();
        l1.printStringlowtoup();
        l1.changevlowtoup();
        l1.printStringvlowtoup();
    }
}
