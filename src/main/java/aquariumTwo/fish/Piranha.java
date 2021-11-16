package aquariumTwo.fish;

import java.util.Formatter;

public class Piranha extends Fish implements Predator {
    private int amountEat;

    public Piranha(int weight) {
        super(weight);
    }

    @Override
    public void eat(Eatable fish) {
        addWeight(fish.getWeight());
        amountEat++;
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
