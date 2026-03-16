/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchh;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Switchh {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter an alphabet =");
      char value=sc.next().charAt(0);
      switch(value)
              {
                  case 'a':
                  System.out.print("You Selected vowel a");
                  break;
                  case 'e':
                  System.out.print("You Selected vowel e");
                  break;
                  case 'i':
                  System.out.print("You Selected vowel i");
                  break;
                  case 'o':
                  System.out.print("You Selected vowel o");
                  break;
                  case 'u':
                  System.out.print("You Selected vowel u");
                  break;
                  default:
                      System.out.print("this is not a vowels");
              }
    }
}
