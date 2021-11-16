package aquariumTwo;

import aquariumTwo.fish.*;
import common.RND;

import java.util.ArrayList;

public class AquariumTwo {
    private ArrayList<Predator> predators;
    private ArrayList<Eatable> guppies;

    {
        this.guppies = new ArrayList<>();
        this.predators = new ArrayList<>();
    }

    public AquariumTwo() {

    }

    public void go() {
        while (!guppies.isEmpty()) {
            feedPredator();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printStatisticsPredator() {
        for (int i = 0; i < predators.size(); i++) {
            System.out.println((i+1) +". " + predators.get(i).toString());
        }
    }

    public void addFishEatable(Eatable eatable ) {
        guppies.add(eatable);
    }

    public void addFishPredators(Predator predator) {
            predators.add(predator);
    }

    public void feedPredator() {
        Predator predator = getPredator();
        Eatable guppy = getEatable();
        predator.eat(guppy);
        removeEatable(guppy);
    }

    private void removeEatable(Eatable guppy) {
        guppies.remove(guppy);
    }

    private Predator getPredator() {
        return predators.get(RND.fish(predators.size()));
    }

    private Eatable getEatable() {
        return guppies.get(RND.fish(guppies.size()));
    }
}
