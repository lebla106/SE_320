public class UserManagementSystemTest extends TestCase  {
    User user;
    UserManagementSystem userSys;

    protected void setUp()
    {
        user = new User();
        userSys = new UserManagementSystem();
    }
    
    public Boolean User addUserTest(User aUser)
    {
        //adds aUser to the database
        //if user is already in database check if null to be true
        //if not, the function will return the user added
        //will check if what is returned is the same as the user added
    }

    public Boolean deleteUserTest(User aUser)
    {
        //removes user from database
        //if user is actually in the database then it will remove it
        //will return the user added to the database
        //will check if what is returned is the same as the user removed
    }

    public Boolean getUserStateTest(User aUser)
    {
        user.userState = "alive";
        if (userSys.getUserState(user) == "alive")
        {
            return true;
        }
        return false;
    }

    public void setUserStateTest(String state,User aUser)
    {
        String state = "alive";
        userSys.setUserState(state, user);
        if (user.userState == state)
        {
            return true;
        }
        return false;
    }

    public void setUserTypeTest(String type,User aUser)
    {
        String state = "alive";
        userSys.setUserType(state, user);
        if (user.userType == state)
        {
            return true;
        }
        return false;
    }

    public String getUserTypeTest(User aUser)
    {
        user.userType = "alive";
        if (userSys.getUserType(user) == "alive")
        {
            return true;
        }
        return false;
    }
}
