package none;

/**
 * Created by artemon on 29.03.17.
 */

public class PhibonachyClass {
    public static int getPhibValuebyNum(int num) {
        int  value;
        if (num == 1) {
            return 0;
        }
        if ((num ==2)||(num == 3)){
            return 1;
        }
        return  getPhibValuebyNum(num-1) + getPhibValuebyNum(num-2);
    }
}

