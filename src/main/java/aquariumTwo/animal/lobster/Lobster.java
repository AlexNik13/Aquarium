package aquariumTwo.animal.lobster;

import aquariumTwo.animal.Animal;
import aquariumTwo.animal.behaviors.SpeedBehavior;
import aquariumTwo.animal.behaviors.ambush.AmbushBehavior;
import aquariumTwo.animal.behaviors.ambush.Stealth;

public class Lobster extends Animal {



    public Lobster(int weight, SpeedBehavior behavior) {
        super(weight, behavior);

    }

    public Lobster(int weight, SpeedBehavior speedBehavior, AmbushBehavior ambushBehavior) {
        super(weight, speedBehavior, ambushBehavior);
    }
}
