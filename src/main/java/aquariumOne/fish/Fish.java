package aquariumOne.fish;

import aquariumOne.RND;

import java.util.Random;

public class Fish {

    private int weight;

    public Fish(int weight) {
        this.weight = RND.next(weight) + 1;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(int fish){
        this.weight += fish;
    }
}
