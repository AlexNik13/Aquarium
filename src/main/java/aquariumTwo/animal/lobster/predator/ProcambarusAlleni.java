package aquariumTwo.animal.lobster.predator;

import aquariumTwo.animal.lobster.Lobster;
import aquariumTwo.animal.speed.SpeedBehavior;
import aquariumTwo.animal.speed.SpeedProcambarusAlleni;

public class ProcambarusAlleni extends Lobster {
    public ProcambarusAlleni(int weight) {
        super(weight, new SpeedProcambarusAlleni());
    }
}
