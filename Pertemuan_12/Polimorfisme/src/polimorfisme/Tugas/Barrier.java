/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme.Tugas;

/**
 *
 * @author lenovo
 */
public class Barrier implements IDestroyable{

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    public String getBarrierInfo(){
        return "Barrier Strenght = " + this.strength; 
    }

    @Override
    public void destroyed() {
        this.strength -= (0.1 * this.strength);
    }
}
