/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastr;
import java.util.*;
/**
 *
 * @author admin
 */
public class Javastr {

    public static void main(String[] args) {
     
        
StringBuilder sb=new StringBuilder("Suyashri");
System.out.println(sb);

System.out.println(sb.charAt(0));

sb.setCharAt(0,'p');
System.out.println(sb);

sb.insert(1, 'S');
System.out.println(sb);

sb.delete(0, 1);
System.out.println(sb);

sb.append(" P");
sb.append("a");
sb.append("t");
sb.append("i");
sb.append("l");

System.out.println(sb);
System.out.println(sb.length());

StringBuilder sb1=new StringBuilder("Suyashri");
for(int i=0;i<sb1.length()/2;i++)
{
    int front=i;
    int back=sb1.length()-1-i;//14-1-0=>13

    char frontChar=sb1.charAt(front);
    char backChar=sb1.charAt(back);
    
    sb1.setCharAt(front, backChar);
     sb1.setCharAt(back, frontChar);
     

}

System.out.print(sb1);
//        
//String firstname="Suyashri is a seraphic girl";
//String lastname=" Patil";
//String  name=" Suyashri  patil  ";
//
//String fullname=firstname+lastname;
//
//System.out.println(firstname.concat(lastname));
//
//System.out.println(firstname.length());
//
// System.out.println(firstname.contains("seraphic"));
// 
//  System.out.println(firstname.toUpperCase());
//  
//     System.out.println(firstname.toLowerCase());
//     
//    System.out.println(lastname.equalsIgnoreCase(name));
//
//      System.out.println(lastname.replace("l","r"));
// 
//  System.out.println(name.trim());
//
//   System.out.println(firstname.indexOf('s'));
//   
//   for(int i=0;i<fullname.length();i++)
//   System.out.println(fullname.charAt(i));
//   
//   1 s1>s2:+ve val
//   2 s1==s2:0
//   3 s1<s2:-ve val

//if(name==firstname)
//   if(name.compareTo(firstname)==0)
//   {
//      System.out.println("String are equal");
//   }
//   else
//   {
//       System.out.println("String are not equal");
//   }
//       
//     
//   String sentence="My Short term goal is achieve good job for my father satisfication";
////   
//   String name2=sentence.Substring(11,sentence.length());
//   System.out.print(name2);
 
//    String are immutable


    

    }
}
