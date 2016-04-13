package com.chapman.operationsaferide;

/**
 * Created by klamkin on 4/10/16.
 * Edited by Melissa LeBlanc on 4/12/16
 * Class that is in herited by PublicSafetyUser and ChapmanUser.
 */
public class User {

    private String state;
    private String type;
    private String name;
    
    /**
     * Public constructor to create an instance of this class
     * @param s 
     * @param t
     * @param n
     * 
     */
    public User(String s, String t, String n)
    {
        state = s;
        type = t;
        name = n;
    }

    /**
	* Gets user type
	* @return String
	*/
    public String getType()
    {
        return type;
    }

    /**
	* Gets user state
	* @return String
	*/
    public String getState()
    {
        return state;
    }
}
