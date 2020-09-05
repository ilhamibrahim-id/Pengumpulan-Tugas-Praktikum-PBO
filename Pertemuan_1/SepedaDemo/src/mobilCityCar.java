/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lenovo
 */
public class mobilCityCar extends Mobil {
    private String tipeBan;   
    public void tipeBan(String newValue) {
        tipeBan = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Ban : " + tipeBan);
    }
}
