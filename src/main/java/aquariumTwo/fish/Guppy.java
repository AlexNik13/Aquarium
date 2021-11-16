package aquariumTwo.fish;

import aquariumTwo.fish.speed.SpeedGuppy;

public class Guppy extends Fish implements Eatable{
    public Guppy(int weight) {
        super(weight, new SpeedGuppy());
    }


}
