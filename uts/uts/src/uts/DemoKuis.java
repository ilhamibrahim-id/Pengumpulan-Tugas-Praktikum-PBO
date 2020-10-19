/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author lenovo
 */
public class DemoKuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SepedaMotor honda = new SepedaMotor("Vario","Honda");
        System.out.println(honda.getMerekMotor());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        
        System.out.println();
        SepedaMotor yamaha = new SepedaMotor("Nmax", "Yamaha");
        System.out.println(yamaha.getMerekMotor());
        System.out.println(yamaha.getMerekMesin());
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
    }
    
}
