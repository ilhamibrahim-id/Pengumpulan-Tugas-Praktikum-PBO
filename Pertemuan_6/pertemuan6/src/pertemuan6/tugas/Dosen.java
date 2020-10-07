/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6.tugas;

/**
 *
 * @author lenovo
 */
public class Dosen extends Pegawai {

    public int jumlahSKS, TARIF_SKS, gaji;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setTarifSKS(int TarifSKS) {
        this.TARIF_SKS = TarifSKS;
    }

    public void setSKS(int SKS) {
        this.jumlahSKS = SKS;
    }
    public int getSKS(){
        return jumlahSKS;
    }
    public int getTarifSKS(){
        return TARIF_SKS;
    }
    public void info(){
        System.out.println("jumlah sks : " + jumlahSKS);
        System.out.println("tarif sks : " + TARIF_SKS);
    }
}
