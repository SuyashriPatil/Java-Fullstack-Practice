/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Mavenproject2 {

    public static void main(String[] args) {
   
       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter the first number =");
//       int num1=sc.nextInt();
//       System.out.print("Enter the second number =");
//       int num2=sc.nextInt();
//       System.out.print("Which operaton do you want to perform +,-,*,/ =");
//       char op=sc.next().charAt(0);
//       if(op=='+')
//       {
//           int sum=num1+num2;
//        System.out.print(num1+"+"+num2+"="+sum);
//       }
//       else if(op=='-')
//       {
//           int substract=num1-num2;
//        System.out.print(num1+"-"+num2+"="+substract);
//       }
//       else if(op=='*')
//       {
//           int multiply=num1*num2;
//        System.out.print(num1+"*"+num2+"="+multiply);
//       }
//       else
//       {
//           int divide=num1/num2;
//           System.out.print(num1+"/"+num2+"="+divide);
//       }

//          System.out.print("Suyashri \t Patil ");
           
//            System.out.print("Enter your name :");
//            String name=sc.nextLine();
//            System.out.print("Your name is "+name);
            
            
            //
            int n=5;
            int pos=2;
            int bitMask=1<<pos;
            int notBitMask=~(bitMask);
            int oper=sc.nextInt();
            
//            AND
//            if((bitMask & n)==0)
//            {
//                System.out.println("bit was Zero");
//            }
//            else
//            {
//                System.out.println("bit was one");
//            }
//      

////OR
//            int newNumber=bitMask |n;
//            System.out.println(newNumber);

//NOT & And

//           int newNumber=notBitMask & n;
//           System.out.println(newNumber);

//update
if(oper==1)
{
 bitMask=1<<pos;
int  newNumber=bitMask | n;
System.out.println(newNumber);

}
else
{
    int newBitMask=~(bitMask);
  int newNumber=newBitMask & n;
  System.out.println(newNumber);
    
}
    
    }
}
