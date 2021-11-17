package aquariumTwo.animal;

import aquariumTwo.animal.Eatable;

public interface Predator {
    boolean isCatch(Eatable fish);
    void eat(Eatable fish);
    int getSpeed();
}
