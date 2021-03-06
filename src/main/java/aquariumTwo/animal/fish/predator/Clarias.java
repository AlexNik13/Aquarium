package aquariumTwo.animal.fish.predator;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.Predator;
import aquariumTwo.animal.fish.Fish;
import aquariumTwo.animal.speed.SpeedBehavior;
import aquariumTwo.animal.speed.SpeedClarias;

import java.util.Formatter;

public class Clarias extends Fish implements Predator {
    private int amountEat;

    public Clarias(int weight) {
        super(weight, new SpeedClarias());
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
        str.format("Clarias весит %-4d грамм. Сьела %-4d рыбешек.", getWeight(), amountEat);
        return str.toString();
    }
}
