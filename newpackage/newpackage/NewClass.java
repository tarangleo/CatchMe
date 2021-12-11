/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.newpackage;

/**
 *
 * @author taran
 */
class superClass
{   
    void display()
    {
        System.out.println("SuperClass");
    }
    
}
class subClass1 extends superClass
{   
    void display()
    {
        System.out.println("SubClass1");
    }
    
}
class subClass2 extends superClass
{   
    void display()
    {
        System.out.println("SubClass2");
    }
    
}
class subClass3 extends superClass
{   
    void display()
    {
        System.out.println("SubClass3");
    }
    
}


public class NewClass 
{
    public static void main(String arg[])
    {
        superClass s1=new superClass();
        subClass1 s2=new subClass1();
        subClass2 s3=new subClass2();
        subClass3 s4=new subClass3();
        superClass ref;
        ref=s1;
        ref.display();
        ref=s2;
        ref.display();
        ref=s3;
        ref.display();
        ref=s4;
        ref.display();
    }
}
