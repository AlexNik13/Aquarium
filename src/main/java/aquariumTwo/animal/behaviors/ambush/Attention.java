package aquariumTwo.animal.behaviors.ambush;

public class Attention implements AmbushBehavior{
    @Override
    public int valueAmbush(int wight, int speed) {
        return (int)(speed + 100 - wight * 0.5);
    }
}
