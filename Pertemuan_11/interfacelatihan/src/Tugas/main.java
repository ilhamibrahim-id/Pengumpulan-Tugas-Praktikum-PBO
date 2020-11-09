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
public class main {
    public static void main(String[] args) {
        Singa a = new Singa("CingaCing",4,"Roaar Roaar","Coklat");
        Keledai b = new Keledai("Kedelai", 4, "Hehehe", "Abu-Abu");
        Gorilla c = new Gorilla("Gulali", 4, "Hauuum Hauum", "Hitam Manis");
        b.displayBinatang();
        b.displayMakan();
        b.displayData();
        System.out.println();
        c.displayBinatang();
        c.displayMakan();
        c.displayData();
        System.out.println();
        a.displayBinatang();
        a.displayMakan();
        a.displayData();
        
    }
    
}
