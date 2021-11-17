package aquariumTwo.animal.speed;

public class SpeedAmano implements SpeedBehavior{
    @Override
    public int countSpeed(int wight) {
        int baseSpeed = 60;
        int slowDown = (int)(wight * 0.2);
        int speed = baseSpeed -  slowDown;
        return Math.max(speed, 0);
    }
}
