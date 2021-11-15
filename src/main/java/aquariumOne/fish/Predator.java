package aquariumOne.fish;

import aquariumOne.RND;

import java.util.Random;

public class Predator {
    // Такие вещи делать статическими в отдельном классе ?
    private int weight;

    public Predator() {
        this.weight = RND.next(15) + 1;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(int fish){
        this.weight += fish;
    }
}
