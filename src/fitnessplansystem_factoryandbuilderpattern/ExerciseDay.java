package fitnessplansystem_factoryandbuilderpattern;
import java.util.List;

public class ExerciseDay {


	private List<Exercise> exercises;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setExercises(List<Exercise> exercises, int sets, int reps) {
		for (Exercise exercise : exercises) {
			exercise.setReps(reps);
			exercise.setSets(sets);
		}	
		this.exercises = exercises;
	}	
	
	@Override
	public String toString() {
		return "ExerciseDay [exercises=" + exercises + ", name=" + name + "]";
	}
}
