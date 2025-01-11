package fitnessplansystem_factoryandbuilderpattern;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ExerciseLoader {

    private List<Exercise> exercises;

    public ExerciseLoader(String filePath) throws IOException {
        exercises = new ArrayList<>();
        loadExercises(filePath);
    }

    private void loadExercises(String filePath) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader(filePath));

        Set<String> prefixes = props.stringPropertyNames().stream()
            .map(key -> key.split("\\.")[0]) // Extract prefixes like Exercise1, Exercise2
            .collect(Collectors.toSet());

        for (String prefix : prefixes) {
            Exercise exercise = new Exercise();
            exercise.setName(props.getProperty(prefix + ".Name"));
            exercise.setType(ExerciseType.valueOf(props.getProperty(prefix + ".Type")));
            exercise.setEquipmentType(ExerciseEquipmentType.valueOf(props.getProperty(prefix + ".EquipmentType")));

            String[] bodyParts = props.getProperty(prefix + ".BodyParts").split(",");
            exercise.setBodyParts(Arrays.stream(bodyParts)
                .map(BodyPart::valueOf)
                .collect(Collectors.toList()));

            exercises.add(exercise);
        }
    }

    public List<Exercise> getAllExercises() {
        return exercises;
    }
}
