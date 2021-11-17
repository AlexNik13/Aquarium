package aquariumTwo.animal.speed;

public class SpeedClarias implements SpeedBehavior{
    @Override
    public int countSpeed(int wight) {
        int baseSpeed = 90;
        int slowDown = (int)(wight * 0.4);
        int speed = baseSpeed -  slowDown;
        return Math.max(speed, 0);
    }
}
