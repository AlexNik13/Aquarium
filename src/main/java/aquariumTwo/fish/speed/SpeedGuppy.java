package aquariumTwo.fish.speed;

public class SpeedGuppy implements SpeedBehavior{
    @Override
    public int countSpeed(int wight){
        int baseSpeed = 80;
        int slowDown = (int)(wight * 0.5);
        int speed = baseSpeed -  slowDown;
        return Math.max(speed, 0);
    }
}
