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
public class TestBayaran {
    public static void main(String[] args) {
       Manajer man = new Manajer("Agus",800,50);
       Programmer prog = new Programmer("Budi", 600, 30);
       Bayaran hr = new Bayaran();
        System.out.println("Bayaran Manajer : " + hr.hitungBayaran(man));
        System.out.println("Bayaran Manajer : " + hr.hitungBayaran(prog));
    }
    
}
