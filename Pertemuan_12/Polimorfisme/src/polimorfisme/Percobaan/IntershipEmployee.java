/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme.Percobaan;

/**
 *
 * @author lenovo
 */
public class IntershipEmployee extends Employee{
    private int lenght;
    
    public IntershipEmployee(String name,int lenght){
        this.lenght = lenght;
        this.name = name;
    }
    public int getLenght(){
        return lenght;
    }
    public void setLenght(int lenght){
        this.lenght = lenght;
    }
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as intership employee for " + lenght + " month/s\n";
        return info;
    }
}
