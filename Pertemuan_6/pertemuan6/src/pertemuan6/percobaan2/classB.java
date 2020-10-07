/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6.percobaan2;

/**
 *
 * @author lenovo
 */
public class classB extends classA{

    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("Nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}
