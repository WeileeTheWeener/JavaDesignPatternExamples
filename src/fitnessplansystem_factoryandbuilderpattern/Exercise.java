package fitnessplansystem_factoryandbuilderpattern;

import java.util.List;

public class Exercise {

	String name;
	ExerciseType type;
	ExerciseEquipmentType equipmentType;
	List<BodyPart> bodyParts;
	
	int sets;
	int reps;
	
	public void setSets(int sets) {
		this.sets = sets;
	}
	
	public void setReps(int reps) {
		this.reps = reps;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setType(ExerciseType type) {
		this.type = type;
	}
	
	public void setEquipmentType(ExerciseEquipmentType equipmentType) {
		this.equipmentType = equipmentType;
	}
	
	public ExerciseEquipmentType getEquipmentType() {
		return equipmentType;
	}
	
	public void setBodyParts(List<BodyPart> bodyParts) {
		this.bodyParts = bodyParts;
	}

	@Override
	public String toString() {
		return "Exercise [name=" + name + ", type=" + type + ", equipmentType=" + equipmentType + ", bodyParts="
				+ bodyParts + ", sets=" + sets + ", reps=" + reps + "]";
	}
}
