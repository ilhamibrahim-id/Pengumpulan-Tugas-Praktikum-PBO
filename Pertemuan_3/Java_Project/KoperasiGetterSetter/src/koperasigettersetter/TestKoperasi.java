package koperasigettersetter;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimit());
        int pilih = 0;
        do {
            System.out.println("=========================================");
            System.out.println("        TRANKSASI Mr " + donny.getNama());
            System.out.println("=========================================");
            System.out.println("1. Masukan Pinjaman");
            System.out.println("2. Masukan Angsuran");
            System.out.println("3. Exit");
            System.out.println("pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukan Pinjaman : ");
                    int pinjam = input.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("Hutang : " + donny.getJumlahPinjam());
                    break;
                case 2:
                    System.out.println("Masukan Angsuran : ");
                    int angsur = input.nextInt();
                    donny.angsur(angsur);
                    System.out.println("Hutang : " + donny.getJumlahPinjam());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("masukan inputan yang benar");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih > 3);

    }
}
