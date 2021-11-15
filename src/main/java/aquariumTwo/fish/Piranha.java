package aquariumTwo.fish;

public class Piranha extends Fish implements Predator{
    private int amountEat;

    public Piranha(int weight) {
        super(weight);
    }

    @Override
    public void eat(Eatable fish) {
        addWeight(fish.getWeight());
        amountEat++;
    }

    @Override
    public int getAmountEat() {
        return amountEat;
    }


}
