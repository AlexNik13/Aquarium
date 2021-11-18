package aquariumTwo.animal.fish.predator;

import aquariumTwo.animal.Predator;
import aquariumTwo.animal.behaviors.BaseSpeedFish;
import aquariumTwo.animal.fish.Fish;
import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.behaviors.SpeedPiranha;

import java.util.Formatter;

public class Piranha extends Fish implements Predator {
    private int amountEat;

    public Piranha(int weight) {
        super(weight, new BaseSpeedFish(0.2));
    }

    @Override
    public void eat(Eatable fish) {
        addWeight(fish.getWeight());
        amountEat++;
    }

    @Override
    public boolean isCatch(Eatable fish){
        if(getSpeed() > fish.getSpeed()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Piranha весит %-4d грамм. Сьела %-4d рыбешек.", getWeight(), amountEat);
        return str.toString();
    }
}
