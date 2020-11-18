/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme.Exercise2;

/**
 *
 * @author lenovo
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        perangkat.voltase=220;
        if(perangkat instanceof TelevisiJadul){
            System.out.println(((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltasi televisi: " + ((TelevisiJadul) perangkat).getVoltase());
        }else if(perangkat instanceof TelevisiModern){
            System.out.println(((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltasi televisi: " + ((TelevisiModern) perangkat).getVoltase());
        }
    }
}
