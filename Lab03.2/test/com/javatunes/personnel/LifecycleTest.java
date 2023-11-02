package com.javatunes.personnel;

import org.junit.*;

class LifecycleTest {

    @Before
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After
    public void afterTest() {
        System.out.println("afterTest");
    }

    @BeforeClass
    public static void beforeTestRun() {
        System.out.println("beforeTestRun");
    }

    @AfterClass
    public static void afterTestRun() {
        System.out.println("afterTestRun");
    }

    @Test
    public void testSomething() {
        System.out.println("testSomething");
    }

    @Test
    public void testSomethingElse() {
        System.out.println("testSomethingElse");
    }
}
