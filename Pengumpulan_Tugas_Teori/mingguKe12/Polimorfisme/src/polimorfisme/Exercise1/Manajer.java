/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme.Exercise1;

/**
 *
 * @author lenovo
 */
public class Manajer extends Pegawai{
    private int tunjangan;
    public Manajer(String nama,int gaji,int tunjangan){
        this.nama=nama;
        this.gaji=gaji;
        this.tunjangan = tunjangan;
    }
    public int getGaji(){
        return gaji;
    }
    public int getTunjangan(){
        return tunjangan;
    }

}
