package com.chapman.operationsaferide;
import java.sql.*
/**
 * Created by klamkin on 4/4/16.
 */
public class UserManagementSystem {
//doesnt follow class diagram exactly because it would not work how we want it to so
    //necessary changes made
    public User addUser(User aUser)
    {
        //adds aUser to the database
        //wil later return user but currently there is no user class
        //will not add user if it already exists
        //everything commented out to avoid errors
        //we also dont have access to this database
    }

    public User deleteUser(User aUser)
    {
        //deletes aUser from the database
        //wil later return user but currently there is no user class
        //everything commented out to avoid errors
    }

    public String getUserState(User aUser)
    {
        return user.userState;
    }

    public void setUserState(String state,User aUser)
    {
        aUser.userState = state;
    }

    public void setUserType(String type,User aUser)
    {
        aUser.userType = type;
    }

    public String getUserType(User aUser)
    {
        retun aUser.userType;
    }
}
