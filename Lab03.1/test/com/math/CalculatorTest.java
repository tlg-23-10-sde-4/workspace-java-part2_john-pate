/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    // fixture: business object(s) under test
    private Calculator calc;

    @BeforeClass
    public static void initializeTestRun() {
        System.out.println("initializeTestRun");
    }

    @AfterClass
    public static void finalizeTestRun () {
        System.out.println("finalizeTestRun");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");

        calc = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    public void testAdd() {
        System.out.println("testAdd");

        assertEquals(5, calc.add(1, 4));  // expected, actual
    }

    @Test
    public void testDivide() {
        System.out.println("testDivide");

        double result = calc.divide(5, 2);
        assertEquals(2.5, result, .001);
    }

    @Test
    public void testIsEven() {
        System.out.println("testIsEven");

        assertTrue(calc.isEven(10));
        assertFalse(calc.isEven(11));
    }
}