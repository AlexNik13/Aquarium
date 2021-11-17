package aquariumTwo.animal.fish;

import aquariumTwo.animal.fish.eatable.Eatable;

public interface Predator {
    boolean isCatch(Eatable fish);
    void eat(Eatable fish);
    int getSpeed();
}
