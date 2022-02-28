package DAY13;

import org.junit.Assert;
import org.junit.Test;

public class FloatUC2 {
    @Test
    public void givenMaximumFloatingNumberAt1stPositionForThreeFloatingNumbersReturnTheSameNumber(){
        float a = 30.0f;
        float b = 20.0f;
        float c = 10.0f;
        if (a>b && a > c) {
            boolean result = a > b && a > c;
            Assert.assertTrue(result);
            System.out.println("a = " + a);
        }
        else if (b>c && b>a ){
            boolean result = a > b && a > c;
            Assert.assertTrue(result);
        }
        else {
            boolean result = a > b && a > c;
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenMaximumFloatingNumberAt2ndPositionForThreeFloatingNumbersReturnTheSameNumber(){
        float a = 30.0f;
        float b = 60.0f;
        float c = 10.0f;
        if (a>b && a > c) {
            boolean result = b > c && b > a ;
            Assert.assertTrue(result);
            System.out.println("a = " + a);
        }
        else if (b>c && b>a ){
            boolean result = b > c && b > a ;
            Assert.assertTrue(result);
            System.out.println("b = " + b);
        }
        else {
            boolean result = a > b && a > c;
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenMaximumFloatingNumberAt3rdPositionForThreeFloatingNumbersReturnTheSameNumber(){
        float a = 30.0f;
        float b = 20.0f;
        float c = 50.0f;
        if (a>b && a > c) {
            boolean result = c > b && c > a ;
            Assert.assertTrue(result);
            System.out.println("a = " + a);
        }
        else if (b>c && b>a ){
            boolean result = c > b && c > a ;
            Assert.assertTrue(result);
            System.out.println("b = " + b);
        }
        else {
            boolean result = c > b && c > a;
            Assert.assertTrue(result);
            System.out.println("c = " + c);
        }
    }
}
