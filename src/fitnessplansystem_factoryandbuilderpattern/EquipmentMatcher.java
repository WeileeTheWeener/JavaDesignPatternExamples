package fitnessplansystem_factoryandbuilderpattern;

import java.util.*;

public class EquipmentMatcher {

    public static List<ExerciseEquipmentType> matchEquipmentTypes(TraineeRestriction restriction) {
        switch (restriction) {
            case NO_EQUIPMENT:
                return Arrays.asList(ExerciseEquipmentType.BODYWEIGHT);

            case CAlISTHENICS_EQUIPMENT:
                return Arrays.asList(
                    ExerciseEquipmentType.BODYWEIGHT,
                    ExerciseEquipmentType.DIPSBAR,
                    ExerciseEquipmentType.PULLUPBAR
                );

            case DUMBELL_ONLY:
                return Arrays.asList(ExerciseEquipmentType.DUMBELLS);

            case GYM:
                return Arrays.asList(                   
                    ExerciseEquipmentType.DUMBELLS,
                    ExerciseEquipmentType.MACHINES,
                    ExerciseEquipmentType.CABLES,
                    ExerciseEquipmentType.BARBELL,
                    ExerciseEquipmentType.DIPSBAR,
                    ExerciseEquipmentType.PULLUPBAR
                );

            default:
                throw new IllegalArgumentException("Unknown restriction: " + restriction);
        }
    }
}
