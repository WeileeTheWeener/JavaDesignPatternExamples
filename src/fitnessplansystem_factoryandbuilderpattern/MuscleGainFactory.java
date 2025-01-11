package fitnessplansystem_factoryandbuilderpattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MuscleGainFactory extends AbstractExercisePlanFactory {

	@Override
	public ExercisePlan create(Trainee trainee) {
	    System.out.println("Creating a muscle gain program for " + trainee.getName());

	    List<ExerciseDay> exerciseDays = new ArrayList<>();
	    
	    try {
	        // Load exercises from properties file
	        ExerciseLoader loader = new ExerciseLoader(".\\src\\fitnessplansystem_factoryandbuilderpattern\\Exercises.properties");

	        // Get valid equipment types for the trainee's restriction
	        List<ExerciseEquipmentType> allowedEquipment = EquipmentMatcher.matchEquipmentTypes(trainee.getRestriction());

	        // Filter exercises based on allowed equipment types
	        List<Exercise> filteredExercises = loader.getAllExercises().stream()
	            .filter(exercise -> allowedEquipment.contains(exercise.getEquipmentType()))
	            .collect(Collectors.toList());

	        // Split exercises into daily plans
	        int exercisesPerDay = Math.max(1, filteredExercises.size() / trainee.getCanExerciseForNumberOfDays());
	        for (int i = 0; i < trainee.getCanExerciseForNumberOfDays(); i++) {
	            ExerciseDay exerciseDay = new ExerciseDay();
	            int startIndex = i * exercisesPerDay;
	            int endIndex = Math.min(startIndex + exercisesPerDay, filteredExercises.size());

	            exerciseDay.setExercises(filteredExercises.subList(startIndex, endIndex),3,10);
	            exerciseDay.setName("Day " + (i + 1));
	            exerciseDays.add(exerciseDay);
	        }
	        System.out.println("Make sure to choose appropriate weight for given rep and get close to failure with proper form.");
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	        System.out.println("Error loading exercises.");
	    }

	    // Build and return the exercise plan
	    return new ExercisePlan.ExercisePlanBuilder()
	        .restTimes("2-3 minutes")
	        .exerciseDays(exerciseDays)
	        .build();
	}
}
