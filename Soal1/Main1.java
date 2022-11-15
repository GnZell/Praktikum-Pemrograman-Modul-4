/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author asus
 */
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        String judul = "", penulis = "";
        int tahun = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Judul: ");
        judul = input.nextLine();
        
        System.out.print("Penulis: ");
        penulis = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun = input.nextInt();

        Buku buku = new Buku(judul, penulis, tahun);
        
        buku.display();
        
    }
}
