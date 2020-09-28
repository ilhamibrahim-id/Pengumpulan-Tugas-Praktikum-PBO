package manusia;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur, umur2, umur3, pilih = 0;
        String nama, nama2, nama3;
        System.out.println("===================================================");
        System.out.println("Nama  : Ilham Ibrahim");
        System.out.println("No    : 10");
        System.out.println("Kelas : TI-2C");
        do {
            System.out.println("===================================================");
            System.out.println("                     KUIS 1");
            System.out.println("===================================================");
            System.out.println("                   JENIS-KELAMIN");
            System.out.println("===================================================");
            System.out.println("1. Pria");
            System.out.println("2. Wanita");
            System.out.println("3. Exit");
            System.out.println("===================================================");
            System.out.println("pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    Pria p = new Pria();
                    System.out.println("Masukan nama : ");
                    nama = input.next();
                    System.out.println("Masukan Umur " + nama + " :");
                    umur = input.nextInt();
                    if (p.dewasa(umur) == true) {
                        System.out.println("DATA ISTRI");
                        System.out.println("Masukan Nama Istri : ");
                        nama2 = input.next();
                        System.out.println("Masukan Umur " + nama2 + " :");
                        umur2 = input.nextInt();
                        Wanita w = new Wanita();
                        w.setNama(nama2);
                        w.setUmur(umur2);
                        w.setDewasa(w.dewasa(umur2));
                        Pria pinfo = new Pria(umur, nama, p.dewasa(umur), w);
                        System.out.println("===================================================");
                        System.out.println("Data Istri : ");
                        w.info();
                        pinfo.info(umur);
                        System.out.println("===================================================");
                    } else {
                        Pria pinfo = new Pria(umur, nama, p.dewasa(umur), null);
                        System.out.println("===================================================");
                        pinfo.info(umur);
                        System.out.println("===================================================");
                    }

                    break;
                case 2:
                    Wanita w = new Wanita();
                    System.out.println("Masukan nama : ");
                    nama = input.next();
                    System.out.println("Masukan Umur " + nama + " :");
                    umur = input.nextInt();
                    if (w.dewasa(umur) == true) {
                        System.out.println("DATA SUAMI");
                        System.out.println("Masukan nama Suami : ");
                        nama2 = input.next();
                        System.out.println("Masukan Umur " + nama2 + " :");
                        umur2 = input.nextInt();
                        System.out.println("DATA ANAK");
                        System.out.println("Masukan Nama Anak");
                        nama3 = input.next();
                        System.out.println("Masukan Umur " + nama3 + " :");
                        umur3 = input.nextInt();
                        Pria anak = new Pria();
                        anak.setNama(nama2);
                        anak.setUmur(umur2);
                        anak.setDewasa(anak.dewasa(umur2));
                        Manusia anakData = new Manusia(umur2, nama2, false);
                        Wanita suami = new Wanita(umur, nama, w.dewasa(umur), anak, anakData);
                        System.out.println("===================================================");
                        System.out.println("Data anak : ");
                        System.out.println("Nama : " + nama3);
                        System.out.println("Umur : " + umur3);
                        suami.info(umur2);
                        System.out.println("===================================================");
                    } else {
                        Wanita w1 = new Wanita(umur, nama, w.dewasa(umur), null, null);
                        System.out.println("===================================================");
                        w1.info(umur);
                        System.out.println("===================================================");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda Salah menginputkan nomor");
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih > 3);
    }

}
