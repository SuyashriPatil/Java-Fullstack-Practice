/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objclass;
import java.util.Scanner;
/**
 *
 * @author admin
 */

//class Person{
//    String name;
//   public int age;
//   Person(int age)
//   {
//       this.age=age;
//   }
//   
//   int getAge()
//   {
//       return age;
//   }
//   
////    void input(String n,int a)
////    {
////        name=n;
////        age=a;
////    }
//    
////    Person(String n,int a)
////    {
////        this.name=n;
////        this.age=a;
////    }
//    void output()
//    {
//        //System.out.println("Name = " + name);
//        System.out.println("Age = " + age);
//        
//    }
//}


class A
{
    int age;
    String name;
     void  Show(int a)
    {
        age=a;
        System.out.println("Age =" + age);
    }
}

class B extends A
{
    void show(int a,String n)
    {
        age=a;
        name=n;
        System.out.println("age =" + age);
        System.out.println("Name =" + name);
    }
}
public  class Objclass {
////        String name;
    ////        int age;
   
 
 
 
  public static void main(String[] args) {
//        
////      Objclass obj=new Objclass();
////        obj.name="Suyashri";
////        obj.age=22;
////        System.out.println("Name=" + obj.name);
////        System.out.println("Age =" + obj.age);
//        
//        Person per1=new Person(22);
////        per1.input("Suyashri Patil",22);
////        per1.output();
//      
//       System.out.print(per1.getAge());
      
       B obj=new B();
      
       obj.Show(22);
       
       obj.show(24,"Suyashri");
          
    }




    
}
