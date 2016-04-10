package com.chapman.operationsaferide;

/*
  Class representing any user of Operation Safe Ride from Chapman University (Chapman Faculty, Staff or Students)
 */
public class ChapmanUser 
{
  private String name;
	private int chapmanID;
	private int numGuest;
	private LocationService pickupLocation;
	private Map dropoffLocation;
	
  //*********************************************** Constructor ***************************************************
	public ChapmanUser()
	{
	  name = "Unknown";
	  chapmanID = "0";
	  numGuests = 0;
	  pickup Location = new Location Service;
	  dropoffLocation = new Map;
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
		return getName;
	}
	
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
	
	 //*********************************************** Other Functions *************************************************
  /*
  Function that sends email to PSafe notifying them of ride request with associated location of requester as well as 
  Chapman ID and name of user and the total number of guests
  
  public boolean requestRide(Map pickupLocation, Map dropoffLocation, int numGuests, String name, int id)
	{
		
	}
	*/
}
