package aquariumTwo.animal.fish.eatable;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.fish.Fish;
import aquariumTwo.animal.speed.SpeedGuppy;

import java.util.Formatter;

public class Guppy extends Fish implements Eatable {
    public Guppy(int weight) {
        super(weight, new SpeedGuppy());
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Guppy весит %-4d грамм. ", getWeight());
        return str.toString();
    }
}
