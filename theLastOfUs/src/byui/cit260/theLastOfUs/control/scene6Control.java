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
        public double calcDistanceToRun(double carMpg, double fuelAmount, double distanceMiles) {
    
    double amountGas = 15;  
    double mpg = 22;
    double miles = amountGas * mpg;
    double km = miles * 1.6;
    
        return km;
        }  
}
