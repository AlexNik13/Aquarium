package aquariumTwo.animal.lobster;

import aquariumTwo.animal.speed.SpeedBehavior;

public class Lobster {
    private int weight;
    private SpeedBehavior speedBehavior;

    public Lobster(int weight, SpeedBehavior behavior) {
        this.weight = checkWeight(weight);
        this.speedBehavior = behavior;
    }

    private int checkWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("weight must be greater when 0");
        }
        return weight;
    }

    public void addWeight(int weight) {
        this.weight += checkWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed(){
        return speedBehavior.countSpeed(weight);
    }
}
