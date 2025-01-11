package fitnessplansystem_factoryandbuilderpattern;


public class Test {

	public static void main(String[] args)  {
		
		Trainee veliEmreTrainee = new Trainee("Veli Emre Çetin");
		
		veliEmreTrainee.setCurrentGoal(Goal.MUSCLEGAIN);
		veliEmreTrainee.setNumberOfExerciseDays(4);
		veliEmreTrainee.setRestriction(TraineeRestriction.GYM);
		
		ExercisePlanFactory.create(veliEmreTrainee);		
	}
}
