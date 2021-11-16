package aquariumTwo;

import aquariumTwo.fish.*;
import common.RND;

import java.util.ArrayList;

public class AquariumTwo {
    private ArrayList<Predator> predators;
    private ArrayList<Eatable> eatables;
    private int eatablesStart;

    {
        this.eatables = new ArrayList<>();
        this.predators = new ArrayList<>();
    }

    public AquariumTwo() {

    }

    public void go() {
        while (!eatables.isEmpty() && checkCanPredatorsCatchFood()) {
            feedPredator();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void feedPredator() {
        Predator predator = getPredator();
        Eatable eatable = getEatable();
        if (predator.checkEat(eatable)) {
            removeEatable(eatable);
        }
    }

    public void printStatistics() {
        System.out.println("хищников " + predators.size() +". Было еды "+ eatablesStart + ". Осталось " + eatables.size()+ ".");
    }

    public void printStatisticsPredator() {
        for (int i = 0; i < predators.size(); i++) {
            System.out.println((i+1) +". " + predators.get(i).toString());
        }
    }

    public void printStatisticsEatable() {

        for (int i = 0; i < eatables.size(); i++) {
            System.out.println((i+1) +". " + eatables.get(i).toString());
        }
    }

    public void addFishEatable(Eatable eatable ) {
        eatables.add(eatable);
        eatablesStart = eatables.size();
    }

    public void addFishPredators(Predator predator) {
            predators.add(predator);
    }

    private void removeEatable(Eatable guppy) {
        eatables.remove(guppy);
    }

    private Predator getPredator() {
        return predators.get(RND.fish(predators.size()));
    }

    private Eatable getEatable() {
        return eatables.get(RND.fish(eatables.size()));
    }

    private boolean checkCanPredatorsCatchFood(){
        int maxSpeedPredator = getMaxSpeedPredator();
        int minSpeedEatable = getMinSpeedEatable();

        return maxSpeedPredator > minSpeedEatable;
    }

    private int getMaxSpeedPredator(){
        int maxSpeed = predators.get(0).getSpeed();
        for (int i = 1; i < predators.size(); i++){
            if(maxSpeed < predators.get(i).getSpeed() ){
                maxSpeed = predators.get(i).getSpeed();
            }
        }
        return maxSpeed;
    }

    private int getMinSpeedEatable(){
        int minSpeed = eatables.get(0).getSpeed();
        for (int i = 1; i < eatables.size(); i++){
            if(minSpeed > eatables.get(i).getSpeed() ){
                minSpeed = eatables.get(i).getSpeed();
            }
        }
        return minSpeed;
    }
}
