package aquariumTwo.fish;

public interface Predator {
    boolean checkCatch (Eatable fish);
    void eat(Eatable fish);
    int getSpeed();
}
