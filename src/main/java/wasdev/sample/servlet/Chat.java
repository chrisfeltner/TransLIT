/** Chat.java
	A class which store chat participants, and handles translation.
	@author Chris Feltner
	@version February 18, 2017
*/
import java.util.ArrayList;

public class Chat{
	private ArrayList<User> participants;
	
	public Chat(/*ArrayList<User> myParticipants*/)
	{
	/*	for(int i = 0; i < myParticipants.length(); i++)
		{
			participants.add(myParticipants.get(i));
		}*/
	}
	
	public void addParticipant(User newParticipant)
	{
		participants.add(newParticipant);
	}
	
	public void removeParticipant(User lostParticipant)
	{
		participants.remove(lostParticipant);
	}
	
	public ArrayList<User> getParticipants()
	{
		return participants
	}
	
	ArrayList<Translation> getTranslation(Message myMessage)
	{
		//todo
	}
}