package aquariumTwo.animal.shrimp.eatabl;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.shrimp.Shrimp;
import aquariumTwo.animal.behaviors.SpeedAmano;

import java.util.Formatter;

public class Amano extends Shrimp implements Eatable {
    public Amano(int weight) {
        super(weight, new SpeedAmano());
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Amano весит %-4d грамм. ", getWeight());
        return str.toString();
    }
}
