/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

import javax.swing.*;

/**
 *
 * @author mukaz1657
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle theArray[] = new Vehicle[5];

        String choice;

        //Fill the array
        for (int i = 0; i < 5; i++) {
            choice = JOptionPane.showInputDialog(
                    "Vehicle" + "\n"
                    + "1 - Car\n"
                    + "2 - Hybrid Car\n"
                    + "3 - Motorcycle\n"
                    + "4 - Truck");
            if (choice.equals("1")) {
                theArray[i] = new Car();
            }
            if (choice.equals("2")) {
                theArray[i] = new HybridCar();
            }
            if (choice.equals("3")) {
                theArray[i] = new Motorcycle();
            }
            if (choice.equals("4")) {
                theArray[i] = new Truck();
            }
        }
    }

}
