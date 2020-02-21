/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author farah
 */
public class CALCTest {
    
    public CALCTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class CALC.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 4;
        int y = 2;
        CALC instance = new CALC();
        int expResult = 6;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testAdd1() {
        System.out.println("add");
        int x = -4;
        int y = 2;
        CALC instance = new CALC();
        int expResult = -2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        int x = 110;
        int y = -220;
        CALC instance = new CALC();
        int expResult = -110;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of devide method, of class CALC.
     */
    @Test
    public void testDevide() {
        System.out.println("devide");
        int x = 7;
        int y = -2;
        CALC instance = new CALC();
        float expResult = -3.5F;
        float result = instance.devide(x, y);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
@Test
    public void testDevide2() {
        System.out.println("devide");
        int x = 4;
        int y = 2;
        CALC instance = new CALC();
        float expResult = 2.0F;
        float result = instance.devide(x, y);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDevide3() {
        System.out.println("devide");
        int x = 0;
        int y = 2;
        CALC instance = new CALC();
        float expResult = 0.0F;
        float result = instance.devide(x, y);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
