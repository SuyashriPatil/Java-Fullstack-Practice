/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wrapper;

/**
 *
 * @author admin
 */
public class Wrapper {

    public static void main(String[] args) {
        int a=22;
        Integer i=Integer.valueOf(a);
        Integer j=a;//autoboxing
        
        int b=i.intValue();
        int c=i;//unboxing
        System.out.println("primitive =" + a);
        System.out.println("Wrapper class =" + i);
    }
}
