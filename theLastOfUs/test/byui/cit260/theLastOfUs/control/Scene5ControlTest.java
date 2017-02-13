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
        System.out.println("test case 1");
        int itemQuantity = 10;
        double itemWeight = 2.0;
        
        double expResult = 20.0;
        Scene5Control instance = new Scene5Control();
        double result = instance.calcRequiredWeight(itemQuantity, itemWeight);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("test case 2");
        int itemQuantity2 = 15;
        double itemWeight2 = 2.0;
        
        double expResult2 = 30.0;
        Scene5Control instance2 = new Scene5Control();
        double result2 = instance2.calcRequiredWeight(itemQuantity, itemWeight);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("test case 3");
        int itemQuantity3 = 5;
        double itemWeight3 = 2.0;
        
        double expResult3 = 10.0;
        Scene5Control instance3 = new Scene5Control();
        double result3 = instance.calcRequiredWeight(itemQuantity, itemWeight);
        assertEquals(expResult, result, 0.0001);
    }
    
}
