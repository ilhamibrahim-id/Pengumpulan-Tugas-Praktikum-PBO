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
public class persegiPanjang extends bangunDatar {
    public float panjang;
    public float lebar;

    float luas(){
        float luas = panjang * lebar;
        System.out.println("luas persegi panjang : " + luas);
        return luas;
    }
    float keliling(){
        float keliling = 2 * (panjang * lebar);
        System.out.println("keliling persegi panjang : " + keliling);
        return keliling;
    }
}
