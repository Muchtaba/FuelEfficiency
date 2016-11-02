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
public class HybridCar extends Vehicle {

    public double getDistance(double litresUsed) {
        double distance = litresUsed * 26.3157894737;
        return distance;
    }
}
