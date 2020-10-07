/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6.tugas;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        do {
            System.out.println("====================================================");
            System.out.println("                TUGAS PERTEMUAN 6");
            System.out.println("====================================================");
            System.out.println("1. Pegawai");
            System.out.println("2. Dosen");
            System.out.println("3. daftar gaji");
            System.out.println("4. exit");
            System.out.println("pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("nip : ");
                    String nip = input.next();
                    System.out.println("nama : ");
                    String nama = input.next();
                    System.out.println("alamat : ");
                    String alamat = input.next();
                    System.out.println("Gaji : ");
                    int gaji = input.nextInt();
                    Pegawai p = new Pegawai(nip, nama, alamat, gaji);
                    DaftarGaji d = new DaftarGaji();
                    d.addPegawai(p);
                    break;
                case 2:
                    break;
                case 3:
                    d.printSemuaGaji();
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Salah input");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}