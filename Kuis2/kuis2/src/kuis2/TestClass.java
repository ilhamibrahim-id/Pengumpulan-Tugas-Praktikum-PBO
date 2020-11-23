/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author lenovo
 */
public class TestClass {
    public static void Proses(MediaInformasi med){
        if(med instanceof Majalah){
            System.out.println("Majalah adalah media ifnormasi!\n");
        }
        else if(med instanceof Buku){
            System.out.println("Buku adalah media informasi! \n");
        }
        else{
            System.out.println("Kategori belum diketahui");
        }
    }
    public static void main(String[] args) {
        Majalah maj = new Majalah();
        Buku buk = new Buku();
        Proses(maj);
        Proses(buk);
        
        MediaInformasi medMaj = new Majalah();
        medMaj.setJMLHalaman(46);
        medMaj.reputasi();
        medMaj.alamatPenerbit("Malang");
        int tahunSekarang = medMaj.getTahunSekarang(2020);
        medMaj.tahunBerdiri(1995);
        
        MediaInformasi medBuk = new Buku();
        medBuk.setJMLHalaman(340);
        medBuk.reputasi();
        medBuk.alamatPenerbit("Surabaya");
        medBuk.getTahunSekarang(2030);
        medBuk.tahunBerdiri(1978);

    }
    
}
