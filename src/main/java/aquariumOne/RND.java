package aquariumOne;

import java.util.Random;

public class RND {
    private static Random RND = new Random();

    public static int next(int value){
        return RND.nextInt(value);
    }
}
