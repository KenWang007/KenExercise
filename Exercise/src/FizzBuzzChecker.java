
/**
 * Created by jkwang on 1/10/17.
 */
public class FizzBuzzChecker {

    public static boolean isFizz(int number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isBuzz(int number) {
        if (number % 5 ==0) {
            return true;
        }
        return false;
    }
}
