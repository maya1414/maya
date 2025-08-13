package dataStructures;

import java.util.ArrayList;
import java.util.List;


public class MultiVisionSources {


    private final List<Observation> observations;


    /**
     * An observation is represented as an array of 3 floats, (x, y, z) (the robot position in the space)
     */
    public MultiVisionSources(List<Observation> observations) {
        this.observations = observations;
    }


    public void addObservation(Observation observation) {
        observations.add(observation);
    }

    public ArrayList<Observation> getGoodObservations() {
        ArrayList<Observation> goodObservations = new ArrayList<>();
        for (Observation observation : observations) {
            if (observation.z() < 0.01f) { // Checks if the robot is on the ground
                goodObservations.add(observation);
            }
        }
        return goodObservations;
    }

}
