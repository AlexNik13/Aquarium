package aquariumTwo.animal.behaviors.ambush;

public class Stealth implements AmbushBehavior {


    @Override
    public int valueAmbush(int wight, int speed) {
        return (int)(speed + 100 - wight * 0.5  );
    }
}
