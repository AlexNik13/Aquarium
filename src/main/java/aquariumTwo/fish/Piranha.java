package aquariumTwo.fish;

import aquariumTwo.fish.speed.SpeedPiranha;

import java.util.Formatter;

public class Piranha extends Fish implements Predator {
    private int amountEat;

    public Piranha(int weight) {
        super(weight, new SpeedPiranha());
    }

    @Override
    public void eat(Eatable fish) {
        addWeight(fish.getWeight());
        amountEat++;
    }

    @Override
    public boolean checkCatch (Eatable fish){
        if(getSpeed() > fish.getSpeed()){
            return true;
        }
        return false;
    }

    public int getAmountEat() {
        return amountEat;
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Piranha весит %-4d грамм. Сьела %-4d рыбешек.", getWeight(), amountEat);
        return str.toString();
    }
}
