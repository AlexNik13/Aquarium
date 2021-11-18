package aquariumTwo.animal;

import aquariumTwo.animal.behaviors.speed.SpeedBehavior;
import aquariumTwo.animal.behaviors.ambush.AmbushBehavior;
import aquariumTwo.animal.behaviors.ambush.NoAmbush;

public class Animal {
    private int weight;
    private SpeedBehavior speedBehavior;
    private AmbushBehavior ambushBehavior;

    public Animal(int weight, SpeedBehavior behavior) {
        this.weight = checkWeight(weight);
        this.speedBehavior = behavior;
        this.ambushBehavior = new  NoAmbush();
    }

    public Animal(int weight, SpeedBehavior speedBehavior, AmbushBehavior ambushBehavior) {
        this.weight = weight;
        this.speedBehavior = speedBehavior;
        this.ambushBehavior = ambushBehavior;
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

    public int getOpportunityAmbush (){
        return ambushBehavior.valueAmbush(getWeight(), getSpeed());
    }
}
