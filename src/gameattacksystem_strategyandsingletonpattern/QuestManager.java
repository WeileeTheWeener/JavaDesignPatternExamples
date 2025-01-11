package gameattacksystem_strategyandsingletonpattern;

import java.util.ArrayList;
import java.util.List;

public class QuestManager {

	private static QuestManager instance;
	
	List<Quest> activeQuests = new ArrayList<Quest>();
	
	public static QuestManager getInstance() {
		
		if(instance == null)
		{
			instance = new QuestManager();
		}
		
		return instance;
	}
	
	public void addActiveQuest(Quest quest)
	{
		try 
		{
			activeQuests.add(quest);
			quest.start();
			
		} catch (Exception e) {
			System.out.println("can't add quest " + e);
		}
		
	}
	
	public void removeActiveQuest(Quest quest)
	{
		try 
		{
			activeQuests.remove(quest);
			quest.complete();
			
		} catch (Exception e) {
			System.out.println("can't remove quest " + e );
		}
	}
	
}
