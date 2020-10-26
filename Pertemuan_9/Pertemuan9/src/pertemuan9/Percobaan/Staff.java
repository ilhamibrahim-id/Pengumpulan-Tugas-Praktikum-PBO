/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Percobaan;

/**
 *
 * @author lenovo
 */
public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;
    public void setLembur(int lembur){
        this.lembur = lembur;
    }
    public int getLembur(){
        return lembur;
    }
    public void setGajiLembur(double gajiLembur){
        this.gajiLembur = gajiLembur;
    }
    public double getGajiLembur(){
        return gajiLembur;
    }
    public double getGaji(int lembur,double gajiLembur){
        return super.getGaji() + lembur * gajiLembur;
    }
    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }
    public void lihatInfo(){
        System.out.println("Nip\t:" + this.getNip());
        System.out.println("Nama\t:" + this.getNama());
        System.out.println("Golongan\t:" + this.getGolongan());
        System.out.println("Jml Lembur\t:" + this.getLembur());
        System.out.println("Gaji Lembur\t:%.0f\n"+this.getGajiLembur());
        System.out.println("Gaji\t:%.0f\n" + this.getGaji());
    }
}
