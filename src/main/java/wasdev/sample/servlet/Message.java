/** User.java
	An object for the chat message. User has String messageText and User sentUser
	@author Chris Feltner
	@version February 18, 2017
*/

public class Message{
	private String messageText;
	private User sender;
	
	public Message(String myMessageText, User mySender)
	{
		sentUser = mySender;
		messageText = myMessageText;
	}
	
	public String getMessage()
	{
		return messageText;
	}
	
	public User getSender()
	{
		return sender;
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