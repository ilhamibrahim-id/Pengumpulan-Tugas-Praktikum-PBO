package manusia;

import java.util.*;

public class Pria extends Manusia {

    private Wanita istri;

    public Pria(int umur, String nama, boolean dewasa,Wanita istri) {
        this.setUmur(umur);
        this.setNama(nama);
        this.setDewasa(dewasa);
        this.istri = istri;

    }

    Pria() {

    }

    public boolean dewasa(int umur) {
        if (umur >= 22) {
            return true;
        } else {
            return false;
        }
    }

    public void info(int umur) {
        System.out.println("DATA PRIA : ");
        super.info();
        if (getDewasa() == true) {
            if (istri.dewasa(umur) == true) {
                System.out.println("Status : ");
                System.out.println("Beristri");
            } else {
                System.out.println("DATA WANITA : ");
                istri.info();
            }
        } else {
            System.out.println("Status : ");
            System.out.println("Masih Kuliah");
        }
    }
}
