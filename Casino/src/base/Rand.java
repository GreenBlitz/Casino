package base;
import java.util.*;

/**
 * @Author Itay Azbel
 */
public class Rand {
    static Random rand = new Random();

    public static int dice() {
        return rand.nextInt(6) + 1;
    }

    public static int[] dice(int num) {
        int[] diceArr = new int[num];
        for (int i = 0; i < diceArr.length; i++) {
            diceArr[i] = dice();
        }
        return diceArr;
    }

    public static boolean coin() {
        int flip = rand.nextInt(2);
        return flip == 1;
    }
}