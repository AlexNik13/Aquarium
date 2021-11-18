package aquariumTwo.animal.shrimp;

import aquariumTwo.animal.Animal;
import aquariumTwo.animal.behaviors.SpeedBehavior;
import aquariumTwo.animal.behaviors.ambush.AmbushBehavior;

public class Shrimp extends Animal {

    public Shrimp(int weight, SpeedBehavior behavior) {
        super(weight, behavior);
    }

    public Shrimp(int weight, SpeedBehavior speedBehavior, AmbushBehavior ambushBehavior) {
        super(weight, speedBehavior, ambushBehavior);
    }
}
