/**
 * Created by jkwang on 1/10/17.
 */
public class FizzBuzz {
    public static String getCode(int number) {
        StringBuilder sb = new StringBuilder();
        boolean isNotFizzOrBuzz = false;
        if(number % 3 == 0 && number % 5 == 0)
        {
            sb.append("fizzbuzz");
            isNotFizzOrBuzz = true;
        }
        else if (number % 3 == 0) {
            sb.append("fizz");
            isNotFizzOrBuzz = true;
        }
        else if (number % 5 == 0) {
            sb.append("buzz");
            isNotFizzOrBuzz = true;
        }
        if (!isNotFizzOrBuzz) {
            sb.append(Integer.toString(number));
        }
        return sb.toString();
    }

    public static String printCode(int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= end; i++) {
            sb.append(getCode(i));
            System.out.println(getCode(i));
        }
        return sb.toString();
    }
}
