/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.newpackage;
interface NewInterface
{
    public void a1();
    public void a2();
    int a3=10;
}
 class interfaceimplement implements NewInterface
 
{
    
    public void a1()
    {
        System.out.println("A1");
    }
    public void a2()
     {
         System.out.println("A2");
     }
}
public class NewClass1 
{
    public static void main(String args[])
    {
        interfaceimplement obj2=new interfaceimplement();
    
        obj2.a1();
        obj2.a2();
        System.out.println("The sum is " + obj2.a3);
    }
}

/**
 *
 * @author taran
 */

