package aquariumTwo.animal.fish.eatable;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.behaviors.BaseSpeedFish;
import aquariumTwo.animal.fish.Fish;
import aquariumTwo.animal.behaviors.SpeedDanio;

import java.util.Formatter;

public class Danio extends Fish implements Eatable {
    public Danio(int weight) {
        super(weight, new BaseSpeedFish(0.4));
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Danio весит %-4d грамм. ", getWeight());
        return str.toString();
    }
}
