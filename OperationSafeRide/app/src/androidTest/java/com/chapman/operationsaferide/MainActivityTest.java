package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * @author Melissa LeBlanc
 * @see {@link TestCase}
 *
 */
public class MainActivityTest extends TestCase {

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        MainActivity maTest = new MainActivity();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test method for {@link java.com.chapman.operationsaferide.MainActivity#makeRequest()}.
     */
    public void testMakeRequest() {
       assertTrue(ma.makeRequest());
    }

    /**
     * Test method for {@link java.com.chapman.operationsaferide.MainActivity#cancelRequest()}.
     */
    public void testCancelRequest() {
        assertTrue(ma.cancelRequest());
    }

}
