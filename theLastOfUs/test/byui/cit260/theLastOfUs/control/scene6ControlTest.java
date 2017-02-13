/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iu
 */
public class scene6ControlTest {
    
    public scene6ControlTest() {
    }

    /**
     * Test of calcDistanceToRun method, of class scene6Control.
     */
    @Test
    public void testCalcDistanceToRun() {
        System.out.println("Good amount of fuel!");
        double carMpg = 22.0;
        double fuelAmount = 15.0;
        double distanceMiles = 330.0;
        scene6Control instance = new scene6Control();
        double expResult = 528.0;
        double result = instance.calcDistanceToRun(carMpg, fuelAmount, distanceMiles);
        assertEquals(expResult, result, 0.0);
    
     System.out.println("Not enough fuel!");
        double carMpg1 = 22.0;
        double fuelAmount1 = 5.0;
        double distanceMiles1 = 110.0;
        scene6Control instance2 = new scene6Control();
        double expResult1 = 176.0;
        double result1 = instance2.calcDistanceToRun(carMpg, fuelAmount, distanceMiles);
        assertEquals(expResult, result, 0.0);
        
     System.out.println("Too much fuel!");
        double carMpg2 = 22.0;
        double fuelAmount2 = 20.0;
        double distanceMiles2 = 440.0;
        scene6Control instance3 = new scene6Control();
        double expResult2 = 704.0;
        double result2 = instance3.calcDistanceToRun(carMpg, fuelAmount, distanceMiles);
        assertEquals(expResult, result, 0.0);    
    }
    
}
