package aquariumTwo.animal.fish.eatable;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.fish.Fish;
import aquariumTwo.animal.speed.SpeedDanio;

import java.util.Formatter;

public class Danio extends Fish implements Eatable {
    public Danio(int weight) {
        super(weight, new SpeedDanio());
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Danio весит %-4d грамм. ", getWeight());
        return str.toString();
    }
}
