package aquariumTwo;

import aquariumTwo.animal.fish.eatable.Danio;
import aquariumTwo.animal.fish.eatable.Guppy;
import aquariumTwo.animal.fish.predator.Piranha;
import common.RND;

public class Main {

    public static void main(String[] args) {
        AquariumTwo aquariumTwo = new AquariumTwo();

        for (int i = 0; i < 35; i++) {
            aquariumTwo.addFishEatable(new Guppy(RND.weight(20)));
        }

        for (int i = 0; i < 15; i++) {
            aquariumTwo.addFishEatable(new Danio(RND.weight(20)));
        }

        for (int i = 0; i < 5; i++) {
            aquariumTwo.addFishPredators(new Piranha(RND.weight(10)));
        }

        aquariumTwo.go();
        aquariumTwo.printStatisticsPredator();
        aquariumTwo.printStatisticsEatable();
        aquariumTwo.printStatistics();


    }



}
