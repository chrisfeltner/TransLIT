/** User.java
	An object for the chat message. User has String messageText and User sentUser
	@author Chris Feltner
	@version February 18, 2017
*/

public class Message{
	private String messageText;
	private User sentUser;
	
	public Message(String myMessageText, User mySentUser)
	{
		sentUser = mySentUser;
		messageText = myMessageText;
	}
	
	public String getMessage()
	{
		return messageText;
	}
	
	public User getSentUser()
	{
		return sentUser;
	}
	
	public void setMessage(String myMessageText)
	{
		messageText = myMessageText;
	}
	
	public void setSentUser(User mySentUser)
	{
		sentUser = mySentUser;		
	}
}