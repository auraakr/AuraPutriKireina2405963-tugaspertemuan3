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
public class soalSatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //input
        System.out.println("Masukkan tiga huruf kecil: ");
        char a = in.next().charAt(0);
        char b = in.next().charAt(0);
        char c = in.next().charAt(0);
        
        boolean cekA = (a != 'a' && a != 'i' && a != 'u' && a != 'e' && a != 'o');
        boolean cekB = (b == 'a' || b == 'i' || b == 'u' || b == 'e' || b == 'o');
        boolean cekC = (c != 'a' && c != 'i' && c != 'u' && c != 'e' && c != 'o');

        if (cekA && cekB && cekC) {
            System.out.println("3 Karakter memiliki urutan konsonan-vokal-konsonan");
        } else {
            System.out.println("Tidak memiliki urutan konsonan-vokal-konsonan");
        }
    }
}
