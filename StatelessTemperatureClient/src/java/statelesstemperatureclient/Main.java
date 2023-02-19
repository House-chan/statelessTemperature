/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelesstemperatureclient;

import java.util.Scanner;
import javax.ejb.EJB;
import mybean.StatelessCounterBeanRemote;
import mybean.StatelessTemeratureBeanRemote;

/**
 *
 * @author house
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float temperature = 0;

        while(true){
            System.out.print("Enter Fahrenheit Temperature if you to quit type any String:");
            try{
                temperature = input.nextFloat();
                System.out.println(statelessTemeratureBean.FToC(temperature));
            }
            catch(Exception e){
                break;
            }
            
        }
    }
    
    @EJB
    private static StatelessTemeratureBeanRemote statelessTemeratureBean;

    /**
     * @param args the command line arguments
     */
    

    
}
