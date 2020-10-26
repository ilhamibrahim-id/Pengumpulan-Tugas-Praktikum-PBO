/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Latihan;

/**
 *
 * @author lenovo
 */
public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(double a,double b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(32.56, 23.7);
    }
}
