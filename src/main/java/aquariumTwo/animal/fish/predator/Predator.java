package aquariumTwo.animal.fish.predator;

import aquariumTwo.animal.fish.eatable.Eatable;

public interface Predator {
    boolean isCatch(Eatable fish);
    void eat(Eatable fish);
    int getSpeed();
}
