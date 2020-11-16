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
abstract class Zombie implements IDestroyable{
    protected int health;
    protected int level;
    public void heal(){
        System.out.println("Health = " + health);
    }
    public void destroyed(){
        System.out.println("Level = " + level);
    }
    public String getZombieInfo(){
        return "Health = " + health + "\nlevel = " + level;
    }
}
