package aquariumTwo;

import aquariumTwo.animal.Eatable;
import aquariumTwo.animal.Predator;
import common.RND;

import java.util.ArrayList;
import java.util.Comparator;

public class AquariumTwo {
    private ArrayList<Predator> predators = new ArrayList<>();
    private ArrayList<Eatable> eatables = new ArrayList<>();

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

        if(predator.isCatch(eatable)){
            predator.eat(eatable);
            removeEatable(eatable);
        }
    }

    public void printStatistics() {
        System.out.println("Хищников " + predators.size() + ". Осталось еды " + eatables.size()+ ".");
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
        return predators.stream()
                .map(Predator::getSpeed)
                .max(Comparator.comparingInt(p -> p))
                .orElse(0);
    }

    private int getMinSpeedEatable(){
        return eatables.stream()
                .map(Eatable::getSpeed)
                .min(Comparator.comparingInt(e -> e))
                .orElse(0);
    }

    public ArrayList<Eatable> getEatables() {
        return eatables;
    }
}
