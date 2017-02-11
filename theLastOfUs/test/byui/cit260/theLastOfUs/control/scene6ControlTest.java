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
     * Test of calcFuelNeeded method, of class scene6Control.
     */
    @Test
    public void testCalcFuelNeeded() {
        System.out.println("calcFuelNeeded");
        double carMpg = 22.0;
        double fuelAmount = 15.0;
        double distanceMiles = 330.0;
        double DistanceKm = 528.0;
        scene6Control instance = new scene6Control();
        double expResult = 528.0;
        double result = instance.calcFuelNeeded(carMpg, fuelAmount, distanceMiles, DistanceKm);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
