/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmarr.cit260.radioRun1.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew
 */
public class GameEquationsTest {

    public GameEquationsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcPercent method, of class GameEquations.
     */
    @Test
    public void testCalcPercent() {
        System.out.println("calcPercent - TEST 1");
        double numberCorrect = 6;
        GameEquations instance = new GameEquations();
        double expResult = 24;
        double result = instance.calcPercent(numberCorrect);
        assertEquals(expResult, result, 0.2);

        System.out.println("calcPercent - TEST 2");
        numberCorrect = -5;
        expResult = -999;
        result = instance.calcPercent(numberCorrect);
        assertEquals(expResult, result, 0.2);

        System.out.println("calcPercent - TEST 3");
        numberCorrect = 26;
        expResult = -999;
        result = instance.calcPercent(numberCorrect);
        assertEquals(expResult, result, 0.2);

        System.out.println("calcPercent - TEST 4");
        numberCorrect = 0;
        expResult = 0;
        result = instance.calcPercent(numberCorrect);
        assertEquals(expResult, result, 0.2);

        System.out.println("calcPercent - TEST 5");
        numberCorrect = 25;
        expResult = 100;
        result = instance.calcPercent(numberCorrect);
        assertEquals(expResult, result, 0.2);

    }

    @Test
    public void testCalcBand() {

        System.out.println("calcBand - TEST 1");
        double frequency = 146.880;
        GameEquations instance = new GameEquations();
        long expResult = 2;
        long result = instance.calcBand(frequency);
        assertEquals(expResult, result);

        System.out.println("calcBand - TEST 2");
        frequency = -24.262;
        expResult = -999;
        result = instance.calcBand(frequency);
        assertEquals(expResult, result);

        System.out.println("calcBand - TEST 3");
        frequency = 0;
        expResult = -999;
        result = instance.calcBand(frequency);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetRandomFrequency() {

        System.out.println("getRandomFrequency - TEST 1");
        GameEquations instance = new GameEquations();
        double result = instance.getRandomFrequency();
        System.out.println("Frequency = " + result + "MHz");
        assertTrue(result >= 0 && result <= 1000);
    }
}
