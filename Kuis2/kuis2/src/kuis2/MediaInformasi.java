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
public class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    private int tahunSekarang;
    
    public int getTahunSekarang(int tahun){
        this.tahunSekarang = tahun;
        return tahunSekarang;
    }
       
    
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
    }
    @Override
    public void reputasi() {
        System.out.println("Reputasi");
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit : " + alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun "+ tahun + " sehingga penerbit ini sekaranag berusia = " + (tahunSekarang - tahun) + "tahun");
    }
    
}
