/** User.java
	An object for the chat user. User has int userID, String name, and Language preferredLanguage
	@author Chris Feltner
	@version February 18, 2017
*/

public class User
{
	
	private int userID;
	private String name;
	private Language preferredLanguage;
	
	public User(int myUserID, String myName, Language myPreferredLanguage)
	{
		userID = myUserID;
		name = myName;
		preferredLanguage = myPreferredLanguage;
	}
	
	public int getUserID()
	{
		return userID;
	}
	
	public String getName()
	{
		return name;
	}

	public Language getPreferredLanguage()
	{
		return preferredLanguage;
	}
	
	public void setName(String myName)
	{
		name = myName;
	}
	
	public void setUserID(int myUserID)
	{
		userID = myUserID;
	}
	
	public void setPreferredLanguage(Language myPreferredLanguage)
	{
		preferredLanguage = myPreferredLanguage;
	}
	
	
}