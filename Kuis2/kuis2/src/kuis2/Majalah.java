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
public class Majalah extends MediaInformasi{
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
    }
    public void reputasi(){
        System.out.println("Majalah Ini Memiliki: " + this.jmlHalaman + " Halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalaah tersebut: " + (this.jmlHalaman+2) + " Halaman");
        System.out.println("Penerbit Majalah ini bereputasi!");
        
    }
}
