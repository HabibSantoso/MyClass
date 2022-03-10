/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Habib Santoso
 */
public class MyClassTest {
    
    MyClass my;
    public MyClassTest() {
    }
    
    @Before
    public void setUp() {
        my = new MyClass();
    }
    
    @After
    public void tearDown() {
        my = null;
    }

    @Test
    public void testMain() {
        int a=20,b=10,c;
        c = my.pertambahan(a, b); // Menghubungkan c dengan method pertambahan
        assertEquals(30, c); // Untuk memperkirakan hasil yang diharapkan
    }
    
}
