package com.chapman.operationsaferide;
import java.sql.*;
/**Class that manages users in relation to a database
 * @author Amanda Benavidez
 */
public class UserManagementSystem {

    private String dbConnection;
    private int studentUserCount;
    private int pSafeUserCount;

    /**
     * instantiates the member variables
     */
    public UserManagementSystem()
    {
        dbConnection = "";
        studentUserCount = 0;
        pSafeUserCount = 0;
    }

    /**
     * Adds the user parameter to the database and returns that user
     * @param user
     * @return user
     */
    public User  addUser(User user)
    {
        //adds user to the database
        // once db is set up this function will works

        if (user.getType().equals("PublicSafety"))
            pSafeUserCount++;
        else if (user.getType().equals("ChapmanStudent"))
            studentUserCount++;
        return user;
    }

    /**
     * Deletes the user from the database and returns that user
     * @param user
     * @return user
     */
    public User deleteUser(User user)
    {
        //deletes user from the database
        // once db is set up this function will work

        if (user.getType().equals("PublicSafety"))
            pSafeUserCount--;
        else if (user.getType().equals("ChapmanStudent"))
            studentUserCount--;
        return user;
    }

    /**
     * Takes in a user to update(old user) and a new user to replace it with (new user)
     * @param oldUser
     * @param newUser
     */
    public void updateUser(User oldUser, User newUser)
    {
        deleteUser(oldUser);
        addUser(newUser);
    }

    /**
     * Returns the number of public safety users in the database
     * @return int
     */
    public int getpSafeUserCount()
    {
        return pSafeUserCount;
    }

    /**
     * Returns the number of student users in the database
     * @return int
     */
    public int getStudentUserCount()
    {
        return studentUserCount;
    }
}
