/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7.percobaan2;

/**
 *
 * @author lenovo
 */
public class Inheritance1 {
    public static void main(String[] args) {
        StafTetap st = new StafTetap("Budi", "Malang", "Laki-Laki", 20, 2000000, 250000, 200000, "2A", 100000);
        st.tampilStaffTetap();
        
        StafHarian sh = new StafHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        sh.tampilStaffHarian();
    }
}
