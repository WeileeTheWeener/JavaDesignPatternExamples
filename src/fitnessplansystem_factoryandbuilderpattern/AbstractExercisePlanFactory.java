package fitnessplansystem_factoryandbuilderpattern;

public abstract class AbstractExercisePlanFactory {
	
	public abstract ExercisePlan create(Trainee trainee);
}
