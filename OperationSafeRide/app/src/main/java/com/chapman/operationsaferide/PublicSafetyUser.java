package com.chapman.operationsaferide;

/**
 * Created by klamkin on 4/4/16.
 */
public class PublicSafetyUser extends User {

    private String name;
    private int chapmanID;
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
        chapmanID = id;
    }

    //ChapmanID
    public void setID(int id)
    {
        this.chapmanID = id;
    }

    public int getID()
    {
        return this.chapmanID;
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
