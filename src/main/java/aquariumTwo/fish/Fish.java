package aquariumTwo.fish;

import common.RND;

public class Fish {
    private int weight;

    public Fish(int weight) {
        this.weight = checkWeight(weight);
    }

    private int checkWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("weight must be greater when 0");
        }
        return weight;
    }

    public int getWeight() {
        return weight;
    }

    public void addWeight(int weight) {
        this.weight += weight;
    }

}
