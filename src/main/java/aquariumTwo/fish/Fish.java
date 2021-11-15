package aquariumTwo.fish;

import common.RND;

public class Fish {
    private int weight;

    public Fish(int weight) {
        this.weight = weight;
        checkWeight();
    }

    private void checkWeight() {
        if (weight <= 0) {
            throw new IllegalArgumentException("weight must be greater when 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void addWeight(int weight) {
        this.weight += weight;
    }
}
