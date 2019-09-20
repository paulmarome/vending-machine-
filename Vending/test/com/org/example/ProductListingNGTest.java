/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.example;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Manase
 */
public class ProductListingNGTest {
    
    public ProductListingNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getProduct method, of class ProductListing.
     */
    @Test
    public void testGetProduct()
    {
        System.out.println("getProduct");
        ProductListing instance = null;
        String expResult = "";
        String result = instance.getProduct();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ProductListing.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductListing instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class ProductListing.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ProductListing instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalAmount method, of class ProductListing.
     */
    @Test
    public void testGetTotalAmount()
    {
        System.out.println("getTotalAmount");
        ProductListing instance = null;
        double expResult = 0.0;
        double result = instance.getTotalAmount();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrency method, of class ProductListing.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        double value = 0.0;
        String expResult = "";
        String result = ProductListing.setCurrency(value);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ProductListing.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProductListing instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
