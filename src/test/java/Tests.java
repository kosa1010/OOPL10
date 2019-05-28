
import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl10.zad2.ArrayIndexOutOfBoundsExceptionTest;
import pl.edu.ur.oopl10.zad3.ArithmeticExceptionTest;
import pl.edu.ur.oopl10.zad4.Zad4;

/**
 */
public class Tests {

    @Test(timeout = 10000)
    public void testEx1() {

    }

    @Test(timeout = 10000)
    public void testEx2() {
        ArrayIndexOutOfBoundsExceptionTest arrayIndexOutOfBoundsExceptionTest = new ArrayIndexOutOfBoundsExceptionTest();

        Assert.assertEquals(arrayIndexOutOfBoundsExceptionTest.getSpecyficIndexValue(100), -1);
    }

    @Test(timeout = 10000)
    public void testEx3() {
        ArithmeticExceptionTest arithmeticExceptionTest = new ArithmeticExceptionTest();

        try {
            arithmeticExceptionTest.tryDivideBy0(10.0);
            Assert.fail();
        } catch (ArithmeticException e) {
            //OK
        }

    }

    @Test(timeout = 60000)
    public void testEx4() {
        Zad4 zad4 = new Zad4();
        zad4.randomDivision();
    }

}
