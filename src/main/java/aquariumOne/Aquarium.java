package aquariumOne;

import aquariumOne.fish.Fish;

import java.util.ArrayList;


public class Aquarium {

    private ArrayList<Fish> guppies;
    private ArrayList<Fish> predators;

    {
        this.guppies = new ArrayList<>();
        this.predators = new ArrayList<>();
    }

    public Aquarium() {
        createFishGuppy();
        createFishPredators();
    }

    public void go(){
        while (!guppies.isEmpty()){
            eat();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printStatistics();
    }

    public void printStatistics(){
        int i = 0;
        for (Fish predator : predators) {
            System.out.println(++i + " " + predator.toString());
        }
    }

    void createFishGuppy() {
        int rnd = RND.next(50);
        for (int i = 0; i < rnd; i++) {
            guppies.add(new Fish(RND.next(20) + 1));
        }
    }

    void createFishPredators() {
        int rnd = RND.next(50);
        for (int i = 0; i < rnd; i++) {
            predators.add(new Fish(RND.next(20) + 1));
        }
    }

    public void eat() {
        predators.get(RND.next(predators.size())).eat(guppies.remove(RND.next(guppies.size())).getWeight());
    }
}
