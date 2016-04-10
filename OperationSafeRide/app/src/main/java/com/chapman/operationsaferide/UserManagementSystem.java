package com.chapman.operationsaferide;
import java.sql.*;
/**
 * Created by klamkin on 4/4/16.
 */
public class UserManagementSystem {

    private String dbConnection;
    private int studentUserCount;
    private int pSafeUserCount;

    public UserManagementSystem()
    {
        dbConnection = "";
        studentUserCount = 0;
        pSafeUserCount = 0;
    }

    public void addUser(User user)
    {
        //adds user to the database
        // once db is set up this function will works

        if (user.getType().equals("PublicSafety"))
            pSafeUserCount++;
        else if (user.getType().equals("ChapmanStudent"))
            studentUserCount++;
    }

    public User deleteUser(User user)
    {
        //deletes user from the database
        // once db is set up this function will work

        if (user.getType().equals("PublicSafety"))
            pSafeUserCount--;
        else if (user.getType().equals("ChapmanStudent"))
            studentUserCount--;
        return null;
    }

    public void updateUser(User oldUser, User newUser)
    {
        deleteUser(oldUser);
        addUser(newUser);
    }

    public int getpSafeUserCount()
    {
        return pSafeUserCount;
    }

    public int getStudentUserCount()
    {
        return studentUserCount;
    }
}
