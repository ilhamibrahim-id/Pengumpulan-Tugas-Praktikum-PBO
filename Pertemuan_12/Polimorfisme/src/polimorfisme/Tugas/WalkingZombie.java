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
public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            this.health += (10 / 100 * this.health);
        } else if (level == 2) {
            this.health += (30 / 100 * this.health);
        } else if (level == 3) {
            this.health += (40 / 100 * this.health);
        }

    }

    public void destroyed() {
        this.health -= (20 * this.health / 100);
    }

    public String getZombieInfo() {
        String p = "";
        p += "Walking Zombie Data =\n";
        p += super.getZombieInfo() + "\n";
        return p;
    }
}
