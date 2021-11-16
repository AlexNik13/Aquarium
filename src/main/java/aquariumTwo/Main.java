package aquariumTwo;

import aquariumTwo.fish.*;
import common.RND;

public class Main {

    public static void main(String[] args) {
        AquariumTwo aquariumTwo = new AquariumTwo();

        for (int i = 0; i < 50; i++) {
            aquariumTwo.addFishEatable(new Guppy(RND.weight(20)));
        }

        for (int i = 0; i < 5; i++) {
            aquariumTwo.addFishPredators(new Piranha(RND.weight(10)));
        }

        aquariumTwo.go();
        aquariumTwo.printStatisticsPredator();
        aquariumTwo.printStatisticsEatable();

        System.out.println();

    }



}
