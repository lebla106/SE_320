package com.chapman.operationsaferide;

/**
 * Class representing any employee of Operation Safe Ride from Chapman University
 */
public class PublicSafetyUser extends User {

    private String name;
    private int employeeID;
    private String state;
    private String type;

    public PublicSafetyUser()
    {
        super("state1", "PublicSafety");
    }

    public PublicSafetyUser(String n, int id, String s)
    {
        super(s, "PublicSafety");
        name = n;
        employeeID = id;
    }

    //EmployeeID
    public void setID(int id)
    {
        this.employeeID = id;
    }

    public int getID()
    {
        return this.employeeID;
    }

    //User Name
    public void setName(String userName)
    {
        this.name = userName;
    }

    public String getName()
    {
        return this.name;
    }

    // user state
    public String getUserState()
    {
        return state;
    }

    public void setUserState(String s)
    {
        state = s;
    }

    // user type
    public String getUserType()
    {
        return type;
    }

    public void setUserType(String t)
    {
        type = t;
    }
}
