/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Tugas;

/**
 *
 * @author lenovo
 */
public class Segitiga {
    private int sudut;
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA,int sudutB){
        return sudut = 180 - (sudutA+sudutB);
    }
    public int keliling(int sisiA,int sisiB,int sisiC){
        return sudut = sisiA + sisiB + sisiC;
        
    }
    public double keliling(int sisiA,int sisiB){
        return sudut = (int) Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB, 2));
    }
    public void infoSudut(){
        System.out.println("Hasilnya = " + this.sudut);
    }
}
