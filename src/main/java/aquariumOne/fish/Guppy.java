package aquariumOne.fish;

import aquariumOne.RND;

import java.util.Random;

public class Guppy {
    private static Random RND = new Random();
    private int weight;

    public Guppy() {
        this.weight = aquariumOne.RND.next(15) + 1;
    }

    public int getWeight() {
        return weight;
    }
}
