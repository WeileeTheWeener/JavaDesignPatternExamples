package fitnessplansystem_factoryandbuilderpattern;

public class ExercisePlanFactory {
	
	//Factory method utility
	public static ExercisePlan create(Trainee trainee)
	{
		switch (trainee.getCurrentGoal()){
		case STRENGTHGAIN:
			AbstractExercisePlanFactory sgf = new StrengthGainFactory();
			return sgf.create(trainee);
		case MUSCLEGAIN:
			AbstractExercisePlanFactory mgf = new MuscleGainFactory();
			return mgf.create(trainee);	
		default:
			throw new IllegalArgumentException("Unexpected or unimplemented goal: " + trainee);
		}
	}

}
