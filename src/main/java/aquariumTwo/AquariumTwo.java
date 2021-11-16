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
        for (int i = 0; i < predators.size(); i++) {
            System.out.println((i+1) +". " + predators.get(i).toString());
        }
    }

    void createFishEatable() {
        int rnd = RND.fish(50) + 1 ;
        for (int i = 0; i < rnd; i++) {
            guppies.add(new Guppy(RND.weight(50)));
        }
    }

    void createFishPredators() {
        int rnd = RND.fish(10) + 1;
        for (int i = 0; i < rnd; i++) {
            predators.add(new Piranha(RND.weight(50)));
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
        return predators.get(RND.fish(predators.size()));
    }

    private Eatable getEatable() {
        return guppies.get(RND.fish(guppies.size()));
    }
}
