package aquariumOne;

import aquariumOne.fish.Fish;

import java.util.ArrayList;
import java.util.Random;

public class Aquarium {

    private ArrayList<Fish> guppies;
    private ArrayList<Fish> predators;

    private Random RND;

    {
        this.guppies = new ArrayList<>();
        this.predators = new ArrayList<>();
        this.RND = new Random();
    }

    public Aquarium() {

    }

    void addFish(){

    }

    public void eat(){

    }
}
