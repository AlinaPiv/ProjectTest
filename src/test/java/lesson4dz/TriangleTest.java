package lesson4dz;

import lesson4.MyException;
import lesson4.TriangleSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {

  /*@Test
    void test() throws MyException {
        TriangleSquare triangleSqr = new TriangleSquare();
      Assertions.assertEquals(, triangleSqr.sqrMethod(10,12,15));
        Assertions.assertThrows(MyException.class,()-> triangleSqr.sqrMethod(-10,20));
        }
   */



    @ParameterizedTest
    void testWithCsvSource(int a, int b, int c) throws MyException {
        TriangleSquare triangleSqr = new TriangleSquare();
        double p=(a+b+c)/2;
        double s=((p*((p-a)*((p-b)*((p-c))))));
        double result =Math.sqrt(s);
        Assertions.assertEquals(result, triangleSqr.sqrMethod(a, b, c)); //не имеет смысла. Просто тренировалась.

    }

    @ParameterizedTest
    @CsvSource({ "10,20,30","50, 200,150","1,2,3"})
    void ValueTest(int a, int b, int c) throws MyException {
        TriangleSquare triangleSqr = new TriangleSquare();

        Assertions.assertTrue((a + b)>c);


   /* @ParameterizedTest
    @CsvSource({ "-10,20","-100, 200","1,-2"})
    void testWithCsvSourceN(int a, int b) throws MyException {
        TriangleSquare triangleSqr = new TriangleSquare();
        Assertions.assertThrows(MyException.class,()-> exampleClass.someMethod(a,b));
    */

    }
}
