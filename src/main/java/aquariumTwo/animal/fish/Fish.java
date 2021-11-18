package aquariumTwo.animal.fish;

import aquariumTwo.animal.Animal;
import aquariumTwo.animal.behaviors.speed.SpeedBehavior;
import aquariumTwo.animal.behaviors.ambush.AmbushBehavior;

public class Fish extends Animal {

    public Fish(int weight, SpeedBehavior behavior) {
        super(weight, behavior);
    }

    public Fish(int weight, SpeedBehavior speedBehavior, AmbushBehavior ambushBehavior) {
        super(weight, speedBehavior, ambushBehavior);
    }
}
