/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percabangan;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class belajarpercabangan {
    public static void main(String[] args) {
//        String namadepan = "harry";
//        String namablkg = "potter";
//        String namalengkap = namadepan + namablkg;
//        
//        //perbandingan string pada java pake .equals()
//        if (namalengkap.equals("harrypotter")) {
//            System.out.println("nama harrypotter");
//        } else {
//            System.out.println("nama bukan harrypotter");
//        }
        
//        double income = 30000, tax;
//        
//        if (income <= 15000) {
//            tax = 0;
//        } else if (income <= 25000) {
//            tax = 0.05 * (income - 15000);
//        } else {
//            tax = 0.05 * (income - (25000 - 15000));
//            tax += 0.10 * (income - 25000);
//            System.out.println("ini blok else");
//        }
//        
//        System.out.println("tax: " + tax);
        
        // switch
        Scanner in = new Scanner(System.in);
        System.out.println("what grade b? ");
        int grade = in.nextInt();
        // switch biasa
//        switch(grade) {
//            case 9:
//                System.out.println("you are a freshmas");
//                break;
//            case 10:
//                System.out.println("you are a sophomore");
//                break;
//            case 11:
//                System.out.println("you are a junior");
//                break;
//            case 12:
//                System.out.println("you are a senior");
//                break;
//            default:
//                System.out.println("invalid grade");
//        }

        //rule switch
        switch(grade) {
            case 9 -> System.out.println("you are a freshmas");
            case 10 -> System.out.println("you are a sophomore");
            case 11 -> System.out.println("you are a junior");
            case 12 -> System.out.println("you are a senior");
            default -> System.out.println("invalid grade");
        }
                
    }
}
