import org.junit.Test;
import org.junit.Assert;
/**
 * Created by jkwang on 1/10/17.
 */
public class FizzBuzzTest {

 /*   @Test
    public void test_isFizz_should_return_false_when_given_2(){
        Assert.assertEquals(FizzBuzz.printCode(2),"2");
    }*/

    @Test
    public void test_isFizz_should_return_true_when_given_2(){
        Assert.assertEquals(FizzBuzz.printCode(2),"12");
    }
}
