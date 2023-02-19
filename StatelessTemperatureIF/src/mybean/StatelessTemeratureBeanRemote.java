/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package mybean;

import javax.ejb.Remote;

/**
 *
 * @author house
 */
@Remote
public interface StatelessTemeratureBeanRemote {

    float FToC(float Fahrenheit);
    
}
