/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7.percobaan1;

/**
 *
 * @author lenovo
 */
public class Inheritance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama="Vivin";
        M.alamat="Jl. vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManager();
        
        Staf s = new Staf();
        s.nama="Lestari";
        s.alamat="Malang";
        s.umur=25;
        s.jk="Perempuan";
        s.gaji=2000000;
        s.lembur=500000;
        s.potongan=250000;
        s.tampilDataStaff();
                
    }
}
