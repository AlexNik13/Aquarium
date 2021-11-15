package aquariumOne.fish;

import aquariumOne.RND;

import java.util.Random;

public class Fish {

    private int weight;
    private int amountEat;

    public Fish(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(int fish){
        weight += fish;
        amountEat++;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "weight=" + weight +
                ", amountEat=" + amountEat +
                '}';
    }
}
