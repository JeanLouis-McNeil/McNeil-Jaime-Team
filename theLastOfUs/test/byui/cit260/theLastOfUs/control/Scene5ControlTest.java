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
public class Scene5ControlTest {
    
    public Scene5ControlTest() {
    }

    /**
     * Test of calcRequiredWeight method, of class Scene5Control.
     */
    @Test
    public void testCalcRequiredWeight() {
        System.out.println("calcRequiredWeight");
        int itemQuantity = 10;
        double itemWeight = 2.0;
        
        double expResult = 20.0;
        Scene5Control instance = new Scene5Control();
        double result = instance.calcRequiredWeight(itemQuantity, itemWeight);
        assertEquals(expResult, result, 0.0001);
    }
    
}
