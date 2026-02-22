/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percabangan;

/*
 * oleh
 * Aura Putri Kireina
 * 2405963
 */
import java.util.Scanner;
public class soalDua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Masukkan panjang tiga sisi: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if (a == b && a == c && b == c) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan kubus");
        }
    }
    
}
