/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu10.newpackage;

/**
 *
 * @author lenovo
 */
public class Orang {

    private String nama;
    private Hewan hewanPeliharaan;
    public Orang(String nama){
        this.nama = nama;
    }
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-------------------------------------------");
    }
}
