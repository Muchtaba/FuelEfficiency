/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

/**
 *
 * @author mukaz1657
 */
public class Truck extends Vehicle {

    public double getDistance(double litresUsed) {
        double distance = litresUsed * 7.09219858156;
        return distance;
    }
}
