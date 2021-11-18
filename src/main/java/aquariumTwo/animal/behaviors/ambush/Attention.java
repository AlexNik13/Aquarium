package aquariumTwo.animal.behaviors.ambush;

public class Attention implements AmbushBehavior{
    @Override
    public int valueAmbush(int wight, int speed) {
        return (int)(speed + 30 - wight * 0.5);
    }
}
