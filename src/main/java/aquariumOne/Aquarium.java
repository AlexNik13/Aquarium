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

        int sumWeight = 0;
        int sumEat = 0;
        for (Fish predator : predators) {
            System.out.println("predator "+ ++i + ": " + predator.toString());
            sumWeight+= predator.getWeight();
            sumEat+= predator.getAmountEat();
        }
        System.out.println("\nTotal");
        System.out.println("predator = "+ i + "\tWeight = " + sumWeight + "\tEat = " + sumEat);
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
        Fish predator = getPredator();
        Fish guppy = getGuppy();
        predator.eat(guppy);
        removeGuppy(guppy);
    }

    private void removeGuppy(Fish guppy) {
        guppies.remove(guppy);
    }

    private Fish getPredator(){
        return predators.get(RND.next(predators.size()));
    }

    private Fish getGuppy(){
        return guppies.get(RND.next(guppies.size()));
    }
}
