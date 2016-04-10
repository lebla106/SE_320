package com.chapman.operationsaferide;

/*
  Class representing any user of Operation Safe Ride from Chapman University (Chapman Faculty, Staff or Students)
 */
public class ChapmanUser extends User
{
	private String name;
	private int chapmanID;
	private int numGuests;
	private String state;
	private String type;

	//private LocationService pickupLocation;
	//private Map dropoffLocation;

	//*********************************************** Constructor ***************************************************
	public ChapmanUser()
	{
        super("state1", "ChapmanStudent");

		name = "Unknown";
		chapmanID = 0;
		numGuests = 0;
		//pickup Location = new LocationService();
		//dropoffLocation = new Map();
	}

    public ChapmanUser(String n, int id, int numG, String s)
    {
        super(s, "ChapmanStudent");

        name = n;
        chapmanID = id;
        numGuests = numG;
        //pickup Location = new LocationService();
        //dropoffLocation = new Map();
    }

	//****************************************** Getters and Setters *************************************************

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

	//Number of Guests
	public void setNumGuests(int guests)
	{
		this.numGuests = guests;
	}

	public int getNumGuests()
	{
		return this.numGuests;
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

	/*
	//Pickup Location
	public void setPickupLocation(Map m)
	{
		this.pickupLocation = m;
	}

	public Map getPickupLocation()
	{
		return this.pickupLocation;
	}

	//Dropoff Location
	public void setDropoffLocation(Map m)
	{
		this.dropoffLocation = m;
	}

	public Map getDropoffLocation()
	{
		return this.dropoffLocation;
	}
	*/

	//*********************************************** Override toString ************************************************
	public String toString()
	{
		//Overriding toString method
		return "Chapman User [Name = " + getName() + ", Chapman ID = " + getID() + ", "
			+ "Number of Guests = " + getNumGuests() + "]";
	}


	//*********************************************** Other Functions *************************************************
	/*
	Function that sends email to PSafe notifying them of ride request with associated location of requester as well as
	Chapman ID and name of user and the total number of guests
	*/

	/*
	public boolean requestRide(Map pickupLocation, Map dropoffLocation, int numGuests, String name, int id)
	{

	}
	*/
}
