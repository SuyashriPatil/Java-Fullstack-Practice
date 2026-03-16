/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchhh;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Switchhh {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=0;
        System.out.println("Enter Vehicle type=");
        String vehicleType=sc.nextLine();
        switch(vehicleType)
        {
            case "car":
                fee=5;
                break;
            case "bus":
                fee=10;
                break;
            case "truck":
                fee=40;
                break;
                
            default:
                System.out.print("unknown vehicle type");
        }
        System.out.print("parking fee for "+vehicleType+" is $"+fee);
    }
}
