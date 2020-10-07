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
public class lingkaran extends bangunDatar {
    public float r;

    float luas() {
        float luas = (float) (3.14 * r * r);
        System.out.println("Luas lingkaran : " + luas);
        return luas;
    }
    float lingkaran(){
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("keliling lingkaran : " + keliling);
        return keliling;
    }
}
