package aquariumTwo;

import aquariumTwo.fish.Eatable;
import aquariumTwo.fish.Guppy;
import aquariumTwo.fish.Piranha;
import aquariumTwo.fish.Predator;
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
        createFishEatable();
        createFishPredators();
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
        printStatistics();
    }

    public void printStatistics() {
        int i = 1;
        for (Predator predator : predators) {
            System.out.printf("Хищник %-5d: весит: %-4d , сьел %-4d рыбешек.\n", i++, predator.getWeight(), predator.getAmountEat());
        }
    }

    void createFishEatable() {
        int rnd = RND.weight(50);
        for (int i = 0; i < rnd; i++) {
            guppies.add(new Guppy(RND.next(20)));
        }
    }

    void createFishPredators() {
        int rnd = RND.weight(10);
        for (int i = 0; i < rnd; i++) {
            predators.add(new Piranha(RND.next(20)));
        }
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
        return predators.get(RND.next(predators.size()));
    }

    private Eatable getEatable() {
        return guppies.get(RND.next(guppies.size()));
    }
}
