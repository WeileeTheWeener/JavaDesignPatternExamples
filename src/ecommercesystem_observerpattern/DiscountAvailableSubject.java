package ecommercesystem_observerpattern;

import java.util.List;

public class DiscountAvailableSubject implements Subject {

	@Override
	public void notifyObservers(List<Observer> observers, String message) 
	{
		for (Observer observer : observers) {
			observer.Update();
			System.out.println(message);
		}	
	}
}
