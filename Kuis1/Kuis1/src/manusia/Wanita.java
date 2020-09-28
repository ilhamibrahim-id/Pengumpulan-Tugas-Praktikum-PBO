package manusia;

import java.util.*;

public class Wanita extends Manusia {

    public Wanita() {
    }
    private Pria suami;
    private Manusia anak;

    public Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak) {
        this.setUmur(umur);
        this.setNama(nama);
        this.setDewasa(dewasa);
        this.suami = suami;
        this.anak = anak;
    }

    public boolean dewasa(int umur) {
        if (umur >= 20) {
            return true;
        } else {
            return false;
        }
    }

 
     public void info(int umur) {
         System.out.println("DATA WANITA : ");
        super.info();
        if (getDewasa() == true) {
            if (suami.dewasa(umur) == true) {
                suami.info();
                System.out.println("Status : ");
                System.out.println("Bersuami");
            } else {
                System.out.println("DATA PRIA : ");
                suami.info();
            }
        } else {
            System.out.println("Status : ");
            System.out.println("Masih Kuliah");
        }
    }
}

