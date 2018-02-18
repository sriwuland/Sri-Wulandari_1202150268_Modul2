package com.example.asus.sriwulandari_1202150268_modul2;

/**
 * Created by Asus on 02/18/2018.
 */

public class pilihanMenu {
    int gambarmenu;
    String namamenu;
    int harga;
    String komposisi;

    public pilihanMenu(int gambarmenu, String namamenu, int harga, String komposisi) {
        this.gambarmenu = gambarmenu;
        this.namamenu = namamenu;
        this.harga = harga;
        this.komposisi = komposisi;
    }

   public int getGambarmenu() { return gambarmenu; }
   public String getNamamenu() { return namamenu; }
   public int getHarga() { return harga; }
   public String getKomposisi() { return komposisi; }
}
