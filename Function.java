/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.function;
import java.util.*;

/**
 *
 * @author admin
 */
public class Function {
//public static void printMyName(String name)
//{
//    System.out.print(name);
//    return;
//}
//    public static void printFactorial(int n)
//    {
//        if(n<0)
//        {
//            System.out.print("Invalid number");
//            return;
//        }
//        int factorial=1;
//        
//        for(int i=n;i>=1;i--)
//        {
//            factorial=factorial * i;
//            
//        }
//        System.out.println(factorial);
//        return;
//    }
    
    
//    
//    static int sum(int a,int b)
//    {
//        return a+b;
//    }
    
    static boolean  even(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else{
          return false;
        }
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//       // String name=sc.next();
//        //printMyName(name);
//        int n=sc.nextInt();
//        printFactorial(n);
//int sum=sum(5,5);
//System.out.print("Sum=" + sum);

        System.out.print(even(8));
        
    }
}
