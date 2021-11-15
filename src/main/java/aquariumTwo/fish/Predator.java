package aquariumTwo.fish;

public interface Predator {
    int getWeight();
    void eat(Eatable fish);
    int getAmountEat();
}
