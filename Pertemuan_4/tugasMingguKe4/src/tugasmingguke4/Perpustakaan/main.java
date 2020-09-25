package tugasmingguke4.Perpustakaan;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String petugas, mahasiswa, nim;
        String nip;
        TraksasiPeminjaman tp = new TraksasiPeminjaman();
        int pilih;
        String pilih2 = "";
        System.out.println("Masukan Nama Petugas : ");
        petugas = input.nextLine();
        System.out.println("Petugas " + petugas + " Masukan NIP : ");
        nip = input.nextLine();
        Petugas p = new Petugas(petugas, nip);
        do {
            System.out.println("=======================================================================");
            System.out.println("Halo Petugas " + petugas);
            System.out.println("Masukan Nama Mahasiswa Yang Ingin Menyewa Buku : ");
            mahasiswa = input.next();
            System.out.println("Masukan Nim Dari Mahasiswa " + mahasiswa + " :");
            nim = input.next();
            Mahasiswa m = new Mahasiswa(mahasiswa, nim);
            Buku b = new Buku();
            System.out.println("=======================List Daftar Buku===============================");
            System.out.println("1. Komik tsubatsa | Penerbit : tsubatsa ");
            System.out.println("2. Laskar Pelangi | Penerbit : Bentang Pusaka");
            System.out.println("3. Cinta Brotosaurus | Penerbit : Gagas Media");
            System.out.println("4. Dear Nathan | Penerbit : Best Media");
            System.out.println("5. Sang Pemimpi | Penerbit : Bentang Pusaka");
            System.out.println("6. Exit");
            System.out.println("Pilih Buku :");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    b.setJudul("Komik tsubatsa");
                    b.setTerbit("tsubatsa");
                    tp.traksasiPinjam(m, b, p);
                    System.out.println(tp.info());
                    System.out.println("Ada Traksasi Baru ?(y/n)");
                    pilih2 = input.next();
                    break;
                case 2:
                    b.setJudul("Laskar Pelangi");
                    b.setTerbit("Bentang Pusaka");
                    tp.traksasiPinjam(m, b, p);
                    System.out.println(tp.info());
                    System.out.println("Ada Traksasi Baru ?(y/n)");
                    pilih2 = input.next();
                    break;
                case 3:
                    b.setJudul("Cinta Brotosaurus");
                    b.setTerbit("Gagas Media");
                    tp.traksasiPinjam(m, b, p);
                    System.out.println(tp.info());
                    System.out.println("Ada Traksasi Baru ?(y/n)");
                    pilih2 = input.next();
                    break;
                case 4:
                    b.setJudul("Dear Nathan");
                    b.setTerbit("Best Media");
                    tp.traksasiPinjam(m, b, p);
                    System.out.println(tp.info());
                    System.out.println("Ada Traksasi Baru ?(y/n)");
                    pilih2 = input.next();
                    break;
                case 5:
                    b.setJudul("Sang Pemimpi");
                    b.setTerbit("Bentang Pusaka");
                    tp.traksasiPinjam(m, b, p);
                    System.out.println(tp.info());
                    System.out.println("Ada Traksasi Baru ?(y/n)");
                    pilih2 = input.next();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan Inputan Yang Benar");
                    System.out.println("Ada Traksasi Baru ?(y/n)");
                    pilih2 = input.next();
                    break;
            }
        } while (pilih2.equalsIgnoreCase("y"));
    }

}
