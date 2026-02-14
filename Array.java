/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;
import java.util.*;
/**
 *
 * @author admin
 */
public class Array {

    public static void main(String args[]) {
//        int  marks[]=new int[3];
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=95;
//        
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        
//       int marks[]={97,98,95};

 Scanner sc =new Scanner(System.in);
 int rows=sc.nextInt();
 int cols=sc.nextInt();
 
 int[][] numbers=new int[rows][cols];
 
 for(int i=0;i<rows;i++)
 {
     for(int j=0;j<cols;j++)
     {
         numbers[i][j]=sc.nextInt();
     }
 }
 
 int x=sc.nextInt();
 for(int i=0;i<rows;i++)
 {
     for(int j=0;j<cols;j++)
     {
         if(numbers[i][j]==x)
         {
             System.out.println(" X found at location (" + i + " ," + j + ")");
         }
     }
 }
 
// for(int i=0;i<rows;i++)
// {
//     for(int j=0;j<cols;j++)
//     {
//        System.out.print(numbers[i][j] + " ");
//     }
//     System.out.println();
// }
// int size=sc.nextInt();
//int numbers[]=new int[size];
//     
//for(int i=0;i<size;i++)
//{
//    numbers[i]=sc.nextInt();
//}
//
//  int x=sc.nextInt();
//  
//
//     for(int i=0;i<numbers.length;i++)
//     {
//         if(numbers[i]==x)
//         {
//         System.out.println(" X Found at index :" + i);
//         }
//     }
//     
     
    }
}
