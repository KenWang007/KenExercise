import org.junit.Test;
import org.junit.Assert;
/**
 * Created by jkwang on 1/10/17.
 */
public class FizzBuzzCheckerTest {

    @Test
    public void test_isFizz_should_return_false(){
        Assert.assertEquals(FizzBuzzChecker.isFizz(1),false);
        Assert.assertEquals(FizzBuzzChecker.isFizz(100),false);
    }


    @Test
    public void test_isFizz_should_return_true(){
        Assert.assertEquals(FizzBuzzChecker.isFizz(3),true);
        Assert.assertEquals(FizzBuzzChecker.isFizz(99),true);
    }

    @Test
    public void test_isBuzz_should_return_false(){
        Assert.assertEquals(FizzBuzzChecker.isBuzz(1),false);
        Assert.assertEquals(FizzBuzzChecker.isBuzz(99),false);
    }

    @Test
    public void test_isBuzz_should_return_true(){
        Assert.assertEquals(FizzBuzzChecker.isBuzz(5),true);
        Assert.assertEquals(FizzBuzzChecker.isBuzz(100),true);
    }
}
