package fitnessplansystem_factoryandbuilderpattern;

import java.util.List;

public class ExercisePlan {

	private List<ExerciseDay> exerciseDays;
	private String restTimes;
	
	ExercisePlan(ExercisePlanBuilder builder) {
		this.exerciseDays = builder.exerciseDays;
		this.restTimes = builder.restTimes;
	}
	
	 //Builder pattern
	 public static class ExercisePlanBuilder {
		 
		 	private List<ExerciseDay> exerciseDays;
			private String restTimes;

	        public ExercisePlanBuilder exerciseDays(List<ExerciseDay> exerciseDays) {
	            this.exerciseDays = exerciseDays;
	            return this;
	        }

	        public ExercisePlanBuilder restTimes(String restTimes) {
	            this.restTimes = restTimes;
	            return this;
	        }

	        public ExercisePlan build() {
	        	for (ExerciseDay exerciseDay : exerciseDays) {
					System.out.println(exerciseDay);
				}
	            return new ExercisePlan(this);	            
	        }
	    }	
	 
	 
}

