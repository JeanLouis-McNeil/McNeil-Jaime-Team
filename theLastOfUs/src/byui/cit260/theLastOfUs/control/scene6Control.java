/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import java.util.Scanner;

/**
 *
 * @author iu
 */
public class scene6Control {
        public double calcFuelNeeded(double carMpg, double fuelAmount, double distanceMiles, double DistanceKm) {
    
            System.out.println("You chose the light truck. Fill in the information below: Tank capacity(90L), percentage(65%) and mpg(22).");
    double amountGas;
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the amount of gas you want.");
    amountGas = in.nextDouble();
      System.out.println("You entered string "+ amountGas);     
      
    double mpg = 22;
    double miles = amountGas * mpg;
    double km = miles * 1.6;
    
        if (km >= 360 && km < 530) {
            System.out.println("Amount well calculated: " + km + " km." );
        }
        if (km > 530) {
            System.out.println("Too much fuel: " + km + " km.");
        }
        if (km < 360) {
            System.out.println("Not able to go to Idaho. You will drive only " + km + " km.");
        }
    
        return km;
        }  
}
