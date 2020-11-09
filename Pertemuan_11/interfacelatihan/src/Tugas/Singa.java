/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;
   public Singa(String nama,int jmlKaki,String suara,String warnaBulu){
       super(nama, jmlKaki);
       this.suara=suara;
       this.warnaBulu=warnaBulu;
    }
   
    public void displayMakan() {
        System.out.println("MAKANAN : Daging");
    }
    public void displayBinatang(){
        System.out.println("JENIS : Karnivora");
        
    }
    public void displayData(){
        System.out.println("Nama : " + getNama());
        System.out.println("Jumlah Kaki : " + getKaki());
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}

