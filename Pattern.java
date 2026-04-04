/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pattern;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int  n=sc.nextInt();
         System.out.print("Enter the number :");
        int m=sc.nextInt();
        
//        *****
//        *****
//        *****   Solid rectangle
//        *****
        
        
        
//        for(int i=0;i<=n;i++)
//        {
//            for(int j=1;j<=m;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        *****
//        *   *
//        *   *    Hollw Rectangle
//        *****
  
//      
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=m;j++)
//    {
//        if(i==1 ||j==1|| i==n || j==m)
//        {
//            System.out.print("*");
//            
//        }
//        else{
//            System.out.print(" ");
//        }
//    }
//    System.out.println();
//}

//*
//**
//***   Half Pyramid
//****

//
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=i;j++)
//    {
//        System.out.print("*");
//    }
//    System.out.println();
//}

//
//****
//***  Inverted Half Pyramid
//**
//*
//    for(int i=n;i>=1;i--)
//    {
//        for(int j=1;j<=i;j++)
//        {
//            System.out.print("*");
//            
//        }
//        System.out.println();
//    }

//   *
//  **
// ***    Inverted Half Pyramid(Rotated by 180 deg)
//****
// for(int i=1;i<=n;i++)
//    {
//        for(int j=1;j<=n-i;j++)
//        {
//            System.out.print(" ");
//            
//        }
//        for(int j=1;j<=i;j++)
//        {
//        System.out.print("*");
//    }
//        System.out.println();
//    }


//1
//12
//123  Half pyramis with number
//1234
//12345

//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=i;j++)
//    {
//        System.out.print(j);
//    }
//    System.out.println();
//}

//12345
//1234
//123   Inverted Half Pyramid with number
//12
//1

//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=n-i+1;j++)
//    {
//        System.out.print(j);
//    }
//    System.out.println();
//}

//1
//2 3
//4 5 6     Floyd's triangle
//7 8 9 10
//11 12 13 14 15

//int num=1;
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=i;j++)
//    {
//        System.out.print(num+" ");
//        num++;
//    }
//    System.out.println();
//}
//    
    
    
// 1
// 0 1
// 1 0 1   0-1 triangle
// 0 1 0 1
// 1 0 1 0 1
//    
    
//Butterfly pattern


//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *

// upper half
//    for(int i=1;i<=n;i++)
//    {
//        for(int j=1;j<=i;j++)
//        {
//            System.out.print("*");
//        }
//        
//        int spaces=2*(n-i);
//        for(int j=1;j<=spaces;j++)
//        {
//            System.out.print(" ");
//        }
//        
//        
////        2nd part
//        for(int j=1;j<=i;j++)
//          {
//    System.out.print("*");
//    }
//     System.out.println();
//    }
//        
//        
//        
//    
////    lower half
//
//     for(int i=n;i>=1;i--)
//    {
//        for(int j=1;j<=i;j++)
//        {
//            System.out.print("*");
//        }
//        
//        int spaces=2*(n-i);
//        for(int j=1;j<=spaces;j++)
//        {
//            System.out.print(" ");
//        }
//        
//        
////        2nd part
//        for(int j=1;j<=i;j++)
//          {
//    System.out.print("*");
//    }
//     System.out.println();
//    }



// Solid Rhombus
//    *****
//   *****
//  *****
// *****
//*****
//     

// for(int i=1;i<=n;i++)
// {
//     for(int j=1;j<=n-i;j++)
//     {
//         System.out.print(" ");
//     }
//     
//     for(int j=1;j<=5;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// 
 

//Number Pyramid

//    1
//   2 2
//  3 3 3 
// 4 4 4 4
//5 5 5 5 5



//
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=n-i;j++)
//    {
//        System.out.print(" ");
//    }
//    for(int j=1;j<=i;j++)
//    {
//        System.out.print(i+ " ");
//    }
//    System.out.println();
//}

//Palindrome Pattern
//
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5 
//    
//
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=n-i;j++)
//    {
//        System.out.print(" ");
//    }
//    for(int j=i;j>=1;j--)
//    {
//        System.out.print(j);
//    }
//    
//    for(int j=2;j<=i;j++)
//    {
//        System.out.print(j);
//    }
//    System.out.println();
//}



//Diamond pattern
//          *
//         ***
//        *****
//       *******
//       *******
//        *****
//         ***
//          *

for(int i=1;i<=n;i++)
{
    for(int j=i;j<=n-1;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}

//lower half

for(int i=n;i>=1;i--)
{
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}








    }
}
