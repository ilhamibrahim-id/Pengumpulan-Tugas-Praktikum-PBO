/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lenovo
 */
public class mobilSUV extends Mobil {

    private String pengerak;

    public void pengerak(String newValue) {
        pengerak = newValue;
    }
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Pengerak Roda : " + pengerak);
    }
}
