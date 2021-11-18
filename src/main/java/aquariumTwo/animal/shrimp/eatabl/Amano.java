package aquariumTwo.animal.shrimp.eatabl;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.behaviors.ambush.Attention;
import aquariumTwo.animal.shrimp.Shrimp;
import aquariumTwo.animal.behaviors.BaseSpeedShrimp;

import java.util.Formatter;

public class Amano extends Shrimp implements Eatable {
    public Amano(int weight) {
        super(weight, new BaseSpeedShrimp(0.4), new Attention());
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Amano весит %-4d грамм. ", getWeight());
        return str.toString();
    }
}
