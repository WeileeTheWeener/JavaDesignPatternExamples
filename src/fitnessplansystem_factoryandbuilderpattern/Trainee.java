package fitnessplansystem_factoryandbuilderpattern;

public class Trainee {
	
	 private String name;
	 private int canExerciseForNumberOfDays;
	 private TraineeRestriction restriction;
	 private Goal currentGoal;
	  
	  public Trainee(String name) {
			this.name = name;
		}
	  
	  public String getName() {
		return name;
	}
		
		public Goal getCurrentGoal() {
			return currentGoal;
		}
		
		public void setCurrentGoal(Goal currentGoal) {
			this.currentGoal = currentGoal;
			System.out.println(name + "'s current goal is " + currentGoal + ".");
		}	
		
		public void setNumberOfExerciseDays(int numberOfExerciseDays) {
			this.canExerciseForNumberOfDays = numberOfExerciseDays;
			System.out.println(name + " can exercise for " + numberOfExerciseDays + " days.");
		}
		
		public void setRestriction(TraineeRestriction restriction) {
			this.restriction = restriction;
		}
		
		public TraineeRestriction getRestriction() {
			return restriction;
		}
			
		public int getCanExerciseForNumberOfDays() {
			return canExerciseForNumberOfDays;
		}

}
