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
public class Scene4ControlTest {
    
    public Scene4ControlTest() {
    }

    /**
     * Test of calculateRequiredWeight method, of class Scene4Control.
     */
    @Test
    public void testCalculateRequiredWeight() {
        System.out.println("calculateRequiredWeight");
        int foodQuantity = 4;
        double foodWeight = 3.0;
        int drinkQuantity = 6;
        double drinkWeight = 3.0;
        Scene4Control instance = new Scene4Control();
        double expResult = 30.0;
        double result = instance.calculateRequiredWeight(foodQuantity, foodWeight, drinkQuantity, drinkWeight);
        assertEquals(expResult, result, 0.0001);
       
    }
    
}
