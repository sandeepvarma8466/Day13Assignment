package DAY13;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    //    UC1
    @Test
    public void givenMaximumNumberAt1stPositionForThreeNumbersReturnTheSameNumber(){
        int a = 30;
        int b = 20;
        int c = 10;
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
    public void givenMaximumNumberAt2ndPositionForThreeNumbersReturnTheSameNumber(){
        int a = 30;
        int b = 50;
        int c = 10;
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
    public void givenMaximumNumberAt3rdPositionForThreeNumbersReturnTheSameNumber(){
        int a = 30;
        int b = 50;
        int c = 60;
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
