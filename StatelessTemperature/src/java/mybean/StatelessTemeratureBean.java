/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybean;

import javax.ejb.Stateless;

/**
 *
 * @author house
 */
@Stateless
public class StatelessTemeratureBean implements StatelessTemeratureBeanRemote {
    
    @Override
    public float FToC(float Fahrenheit) {
        float celsius = (Fahrenheit-32);
//        System.out.println("First formula is " + celsius);
        celsius *= 0.556;
//        System.out.println("Second formula is " + celsius);
        return celsius;
    }

    
}
