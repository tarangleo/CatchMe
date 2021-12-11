/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.newpackage;
import java.util.Scanner;

/**
 *
 * @author taran
 */

public class oddeven 
{
    static int[][] a=new int[10][10];
    int r,c;
     
    public static void main(String args[])
    {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Value of r :");
        int r = myObj.nextInt();
        System.out.println("Enter Value of c :");
        int c = myObj.nextInt();
        for(int i=0; i<c; i++)  
        {  
//reading array elements from the user 
            for(int j=0; j<r; j++)  
            {
                a[i][j]=0;  
            } 
        }
        int[][] f = check(a,r,c);
        for(int i=0; i<c; i++)
        {  
//reading array elements from the user 
            for(int j=0; j<r; j++)  
            {
                System.out.print(f[i][j]); 
            }
            System.out.println("");
        }
        
    }
    public static int[][] check(int[][] a,int r,int c)
    {
        int[][] b=new int[10][10];
        
        for(int i=0; i<c; i++)  
        {  
//reading array elements from the user 
            for(int j=0; j<r; j++)  
            {
                b[i][j]=a[i][j];  
            } 
        }
        for(int i=0; i<c; i++)  
        {  
//reading array elements from the user 
            for(int j=0; j<r; j++)  
            {
                    if ((i+j)%2==0)
                    {
                        b[i][j]=2;
                    
                    }
                    else
                    {
                        b[i][j]=1;
                    }
                        
            } 
        }
        return b;
    }
    
  
}
    

