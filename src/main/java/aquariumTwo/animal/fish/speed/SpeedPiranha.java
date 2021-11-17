package aquariumTwo.animal.fish.speed;

public class SpeedPiranha implements SpeedBehavior{
    @Override
    public int countSpeed(int wight) {
        int baseSpeed = 100;
        int slowDown = (int)(wight * 0.3);
        int speed = baseSpeed -  slowDown;
        return Math.max(speed, 0);
    }
}
