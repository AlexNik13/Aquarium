package aquariumTwo.animal.lobster.predator;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.Predator;
import aquariumTwo.animal.behaviors.speed.BaseSpeedLobster;
import aquariumTwo.animal.behaviors.ambush.Stealth;
import aquariumTwo.animal.lobster.Lobster;

import java.util.Formatter;

public class ProcambarusAlleni extends Lobster implements Predator {
    private int amountEat;

    public ProcambarusAlleni(int weight) {
        super(weight, new BaseSpeedLobster(0.5), new Stealth());
    }

    @Override
    public void eat(Eatable eatable) {
        addWeight(eatable.getWeight());
        amountEat++;
    }

    @Override
    public boolean isCatch(Eatable eatable){
        if(getSpeed() > eatable.getSpeed() || getOpportunityAmbush() > eatable.getOpportunityAmbush()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("Lobster Procambarus Alleni весит %-4d грамм. Сьела %-4d рыбешек.", getWeight(), amountEat);
        return str.toString();
    }
}
