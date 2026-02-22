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
public class soalTiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("jam masuk: ");
        int masuk = in.nextInt();
        System.out.println("jam keluar: ");
        int keluar = in.nextInt();
        
        if (masuk > keluar) {
            keluar += 12;
        }
        
        int lama = keluar - masuk;
        System.out.println("Lama Bekerja " + lama + " Jam");
    }
}
