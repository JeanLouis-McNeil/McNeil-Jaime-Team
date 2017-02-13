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
public class Scene3ControlTest {
    
    public Scene3ControlTest() {
    }

    /**
     * Test of calcCorrectWeight method, of class Scene3Control.
     */
    @Test
    public void testCalcCorrectWeight() {
        System.out.println("test case 1");
        int waterQuantity = 1;
        double waterWeight = 1000.0;
        int serumQuantity = 2;
        double serumWeight = 2500.0;
        Scene3Control instance = new Scene3Control();
        double expResult = 6000.0;
        double result = instance.calcCorrectWeight(waterQuantity, waterWeight, serumQuantity, serumWeight);
        assertEquals(expResult, result, 0.0);

   
        System.out.println("test case 2");
        int waterQuantity2 = 0;
        double waterWeight2 = 1000.0;
        int serumQuantity2 = 1;
        double serumWeight2 = 2500.0;
        Scene3Control instance1 = new Scene3Control();
        double expResult2 = 2500.0;
        double result2 = instance1.calcCorrectWeight(waterQuantity, waterWeight, serumQuantity, serumWeight);
        assertEquals(expResult2, result2, 0.0);
        
        
        System.out.println("test case 3");
        int waterQuantity3 = 2;
        double waterWeight3 = 1000.0;
        int serumQuantity3 = 1;
        double serumWeight3 = 2500.0;
        Scene3Control instance2 = new Scene3Control();
        double expResult3 = 4500.0;
        double result3 = instance2.calcCorrectWeight(waterQuantity, waterWeight, serumQuantity, serumWeight);
        assertEquals(expResult3, result3, 0.0);
        

        System.out.println("test case 4");
        int waterQuantity4 = 3;
        double waterWeight4 = 1000.0;
        int serumQuantity4 = 2;
        double serumWeight4 = 2500.0;
        Scene3Control instance3 = new Scene3Control();
        double expResult4 = 8000.0;
        double result4 = instance3.calcCorrectWeight(waterQuantity, waterWeight, serumQuantity, serumWeight);
        assertEquals(expResult4, result4, 0.0);

    }
    }

    

