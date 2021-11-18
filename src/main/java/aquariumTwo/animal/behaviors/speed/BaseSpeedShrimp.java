package aquariumTwo.animal.behaviors.speed;

import common.RND;

public class BaseSpeedShrimp implements SpeedBehavior{
    private final int SPEED_BASE = RND.speed() ;
    private final double INDEX_WIGHT;

    public BaseSpeedShrimp(double indexWight) {
        this.INDEX_WIGHT = checkINDEX_WIGHT(indexWight);
    }

    private double checkINDEX_WIGHT(double indexWight){
        if(indexWight >= 0.1 && indexWight < 1){
            return indexWight;
        }
        return 0.9;
    }

    @Override
    public int countSpeed(int wight) {
        return Math.max((int) (SPEED_BASE - wight * INDEX_WIGHT), 0);
    }
}