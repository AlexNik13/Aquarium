package aquariumOne;

import aquariumOne.fish.Guppy;
import aquariumOne.fish.Predator;

import java.util.ArrayList;
import java.util.Random;

public class Aquarium {

    private ArrayList<Guppy> guppies;
    private ArrayList<Predator> predators;

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
