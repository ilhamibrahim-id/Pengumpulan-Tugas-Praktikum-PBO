/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelilingbangundatar;

/**
 *
 * @author lenovo
 */
public class segitiga extends bangunDatar{
    public float alas; 
    public float tinggi;
    float luas(){
        float luas = (float)((float) (alas * tinggi) * 0.5);
        System.out.println("luas segitiga : " + luas);
        return luas;
    }
    public float keliling(){
        float sisi = (float) ((Math.pow(tinggi,2)) -  (Math.pow(1/2*alas,2)));
        float keliling = sisi + sisi + alas;
        System.out.println("Luas Segitiga: " + keliling);
        return keliling;
    }
    
}
