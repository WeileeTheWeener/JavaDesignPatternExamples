package ecommercesystem_observerpattern;

import java.util.List;

public interface Subject 
{
	default void addObserver(Observer observer, List<Observer> observerList)
	{
		observerList.add(observer);
	}
	
	default void removeObserver(Observer observer, List<Observer> observerList)
	{
		observerList.remove(observer);
	}
	
	void notifyObservers(List<Observer> observers, String messsage);
}
