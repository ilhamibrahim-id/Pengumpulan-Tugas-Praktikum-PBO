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
        System.out.println("Masukan Banyaknya Karyawan : ");
        int banyak = input.nextInt();
        DaftarGaji dg = new DaftarGaji(banyak);
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
                    System.out.println("===========STANDAR GAJI KARYAWAN 2 JT=================");
                    Pegawai p = new Pegawai();
                    System.out.println("Masukan nama Pegawai : ");
                    String nama = input.next();
                    p.setNama(nama);
                    System.out.println("Masukan Alamat " + nama + " : ");
                    String alamat = input.next();
                    p.setAlamat(alamat);
                    System.out.println("Masukan Nip " + nama + " : ");
                    String nip = input.next();
                    p.setNip(nip);
                    dg.addPegawai(p);
                    break;
                case 2:
                    System.out.println("===========STANDAR GAJI DOSEN 1 SKS X 150.000=================");
                    Dosen d = new Dosen();
                    System.out.println("Masukan Nama Dosen : ");
                    String namaD = input.next();
                    d.setNama(namaD);
                    System.out.println("Masukan Alamat " + namaD + " : ");
                    String alamatD = input.next();
                    d.setAlamat(alamatD);
                    System.out.println("Masukan Nip " + namaD + " : ");
                    String nipD = input.next();
                    d.setNip(nipD);
                    System.out.println("Masukan Sks yang di ajar Dosen " + namaD + " : ");
                    int sks=input.nextInt();
                    d.setSKS(sks);
                    dg.addPegawai(d);
                    break;
                case 3:
                    dg.printSemuaGaji();
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

