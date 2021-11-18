package common;

import java.util.Random;

public class RND {
    private static Random RND = new Random();

    public static int animal(int value){
        return RND.nextInt(value);
    }
    public static int weight(int value){
        return RND.nextInt(value) + 1;
    }
    public static int speed(){
        return (int) (RND.nextInt(50) + 100 * Math.random());
    }
}
