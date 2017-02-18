/** Chat.java
	A class which stores translations and recipients.
	@author Chris Feltner
	@version February 18, 2017
*/

public class Translation{
	User recipient;
	String translatedMessage;
	
	public Translation(User myRecipient, String myTranslatedMessage)
	{
		recipient = myRecipient;
		translatedMessage = myTranslatedMessage;
	}
	
	public User getRecipient()
	{
		return recipient;
	}
	
	public String getTranslatedMessage()
	{
		return translatedMessage;
	}
}