/** Chat.java
	A class which store chat participants, and handles translation.
	@author Chris Feltner
	@version February 18, 2017
*/
import java.util.ArrayList;

public class Chat{
	private ArrayList<User> participants = new ArrayList<User>;
	
	public Chat(/*ArrayList<User> myParticipants*/)
	{
	/*	for(int i = 0; i < myParticipants.size(); i++)
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
		//create instance of LanguageTranslator
		Final String username = "";
		Final String password = "";
		LanguageTranslator service = new LanguageTranslator();
		service.setUsernameAndPassword(username, password);
		
		ArrayList<User> participantsNeedingTranslation = new ArrayList<User>;
		ArrayList<Translation> translations = new ArrayList<Translation>;
		for(int i = 0; i < participants.size(); i++)
		{
			if(participants.get(i).getUserID() != myMessage.getUser().getUserID() && !(participants.get(i).getPreferredLanguage().equals(myMessage.getSender().getPreferredLanguage()))
			{
				participantsNeedingTranslation.add(participants.get(i));
			}
		}
		for(int i = 0; i < participantsNeedingTranslation.size(); i++)
		{
			String translatedMessageText = service.translate(myMessage.getMessage(), myMessage.getUser().getPreferredLanguage(), participantsNeedingTranslation.get(i).getPreferredLanguage()).toString();
			Translation myTranslation = new Translation(participantsNeedingTranslation.get(i), translatedMessageText);
			translations.add(myTranslation);
		}
	}
}