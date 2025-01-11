package gameattacksystem_strategyandsingletonpattern;

public class KillQuest extends ConcreteQuest{

	@Override
	public void start() {
		System.out.println("Kill Quest started.");		
	}

	@Override
	public void complete() {
		System.out.println("Kill Quest completed.");		
	}

}
