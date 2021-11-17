package aquariumTwo.fish;

public interface Predator {
    boolean isCatch(Eatable fish);
    void eat(Eatable fish);
    int getSpeed();
}
