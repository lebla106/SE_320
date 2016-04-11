package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * Created by Amit on 4/10/2016.
 */
public class PublicSafetyUserTest extends TestCase {

    private String testName;
    private int testID;
    private String testString;
    private PSafeUser user;


    protected void setUp() throws Exception
    {
        super.setUp();
        PsafeUser user = new PsafeUser();
        testName = "Officer1";
        testID = 321;
    }

    //Tests the setName and getName method
    public void testName()
    {
        user.setName(testName);
        assertEquals(user.getName(), "Officer1");
    }

    //Tests the setID and getID method
    public void testID()
    {
        user.setID(testID);
        assertEquals(user.getID(), 321);
    }

}