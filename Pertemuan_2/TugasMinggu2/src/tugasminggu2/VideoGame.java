/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class VideoGame {

    public int id, hargaGame, totalHarga;
    public String namaMember, namaGame;

    public void id(int value) {
        id = value;
    }

    public void namaMember(String value) {
        namaMember = value;
    }

    public void namaGame(String value) {
        namaGame = value;
    }

    public void hargaGame(int value) {
        hargaGame = value;
    }

    public void totalHarga(int value) {
        totalHarga = value * hargaGame;
    }

    public void cetakStatus() {
        System.out.println("id : " + id);
        System.out.println("nama : " + namaMember);
        System.out.println("Nama Game Yang Di sewa : " + namaGame);
        System.out.println("Harga : " + hargaGame + " /hari");
        System.out.println("Yang Harus Dibayarkan : " + totalHarga);
        System.out.println("==========================================");
        System.out.println("            Tranksasi sukses");
        System.out.println("==========================================");
    }

    public void cetakStatusGameDanHarga() {
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga : " + hargaGame);
    }

    public static void main(String[] args) {
        VideoGame vg = new VideoGame();
        Scanner input = new Scanner(System.in);
        int pilih = 0, hargaGame1, hargaGame2, hargaGame3;
        System.out.println("Masukan Nomor id : ");
        int idInput = input.nextInt();
        vg.id(idInput);
        System.out.println("Nama Member : ");
        String namaMemberInput = input.next();
        vg.namaMember(namaMemberInput);
        System.out.println("");
        System.out.println("Hai " + namaMemberInput);
        do {
            System.out.println("==========================================");
            System.out.println("              BATOKA GAME               ");
            System.out.println("==========================================");
            System.out.println("PILIH GAME YANG AKAN DI SEWA : ");
            System.out.println("1. digimon rumble arena - Rp.30.000,-");
            System.out.println("2. naruto ninja impact - Rp.45.000,-");
            System.out.println("3. Fifa Street - Rp.25.000,-");
            System.out.println("4. Exit");
            System.out.println("==========================================");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    vg.namaGame("digimon rumble arena");
                    vg.hargaGame(30000);
                    vg.cetakStatusGameDanHarga();
                    System.out.println("Berapa hari akan disewa ? di kalikan " + vg.hargaGame + " /hari");
                    hargaGame1 = input.nextInt();
                    vg.totalHarga(hargaGame1);
                    System.out.println("==========================================");
                    System.out.println("            STRUK BATOKA GAME               ");
                    System.out.println("==========================================");
                    vg.cetakStatus();
                    break;
                case 2:
                    vg.namaGame("naruto ninja impact");
                    vg.hargaGame(45000);
                    vg.cetakStatusGameDanHarga();
                    System.out.println("Berapa hari akan disewa ? di kalikan " + vg.hargaGame + " /hari");
                    hargaGame2 = input.nextInt();
                    vg.totalHarga(hargaGame2);
                    System.out.println("==========================================");
                    System.out.println("            STRUK BATOKA GAME               ");
                    System.out.println("==========================================");
                    vg.cetakStatus();
                    break;
                case 3:
                    vg.namaGame("fifa street");
                    vg.hargaGame(25000);
                    vg.cetakStatusGameDanHarga();
                    System.out.println("Berapa hari akan disewa ? di kalikan " + vg.hargaGame + " /hari");
                    hargaGame3 = input.nextInt();
                    vg.totalHarga(hargaGame3);
                    System.out.println("==========================================");
                    System.out.println("            STRUK BATOKA GAME               ");
                    System.out.println("==========================================");
                    vg.cetakStatus();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("MASUKAN INPUTAN YANG BENAR");
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih > 4);
    }
}
