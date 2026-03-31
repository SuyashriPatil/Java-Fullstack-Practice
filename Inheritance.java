/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;
import java.util.Scanner;
import com.mycompany.inheritance.mypackage.*;
/**
 *
 * @author admin
 */
  class Employee
{
    protected String name;
   protected int age;
    
   public void output()
    {
    System.out.println("Name =" + name);
    System.out.println("Age =" + age);
    }
}


class Teacher extends Employee
{
    int salary;
    void output1()
    {
        System.out.println("Salary=" + salary);
    }
    
}

class Professor extends Employee
{
  
}
public class Inheritance {

    public static void main(String[] args) {
      
        Professor p1=new Professor();
        p1.age=25;
        p1.salary=2500000;
        p1.name="Suyashri";
        p1.output();
        p1.output1();
        
        
//        Teacher t1=new Teacher();
//        t1.name="Suyashri";
//        t1.age=22;
//        t1.output();
//        
    }
}
