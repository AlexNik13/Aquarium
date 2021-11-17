package aquariumTwo.animal.speed;

public class SpeedProcambarusAlleni implements SpeedBehavior{

    @Override
    public int countSpeed(int wight) {
        int baseSpeed = 70;
        int slowDown = (int)(wight * 0.3);
        int speed = baseSpeed -  slowDown;
        return Math.max(speed, 0);
    }
}
