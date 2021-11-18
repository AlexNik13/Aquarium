package aquariumTwo.animal.fish.eatable;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.behaviors.speed.BaseSpeedFish;
import aquariumTwo.animal.behaviors.ambush.Attention;
import aquariumTwo.animal.fish.Fish;

import java.util.Formatter;

public class Guppy extends Fish implements Eatable {
    public Guppy(int weight) {
        super(weight, new BaseSpeedFish(0.3), new Attention());
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Guppy весит %-4d грамм. ", getWeight());
        return str.toString();
    }
}
