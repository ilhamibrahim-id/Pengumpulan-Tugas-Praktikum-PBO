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
public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-2");
        ow.pay(eBill);
        System.out.println("--------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("--------------------------------");
        
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("--------------------------------");
        ow.showMyEmployee(iEmp);
    }
    
}
