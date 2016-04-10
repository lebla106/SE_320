package com.chapman.operationsaferide;

/**
 * Created by klamkin on 4/10/16.
 */
public class User {

    private String state;
    private String type;

    public User(String s, String t)
    {
        state = s;
        type = t;
    }

    public String getType()
    {
        return type;
    }

    public String getState()
    {
        return state;
    }
}
