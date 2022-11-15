/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author asus
 */
public class Komik extends Buku {
    private int volume;
    private String sinopsis;
    
    // Konstruktor
    public Komik(String j, String p, String t, Integer v, String s) {
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }
    
    String getKomikDetail() {
        return "Data yang baru diinputkan adalah \n"
                + "Sebuah komik dengan judul \"" + judul + "\".\n"
                + "Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ".\n"
                + "Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah.\n"
                + "Sinopsis : " + sinopsis.substring(0, 64) + "...";
    }
}

