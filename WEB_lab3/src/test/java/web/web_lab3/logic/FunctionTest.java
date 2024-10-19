package web.web_lab3.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void  testFunction1() {
        Function function = new Function(1.65, 0.7, 2.0, 0.005);
        double y1 = function.solveFunction(0.5);
        double y2 = function.solveFunction(1.3);
        double y3 = function.solveFunction(2.5);
        assertEquals(-27.2146, y1, 0.00001);
        assertEquals(11.6062, y2, 0.0001);
        assertEquals(2.819, y3, 0.000001);
    }

    @Test
    void testFunction2() throws Exception {
        Function function = new Function(1.65, 0.7, 2.0, 0.005);
        function.countSteps();
        assertEquals(261,function.getSteps());
    }

    @Test
    void testFunction3() throws Exception {
        Function function = new Function(1.65, 0.7, 2.0, 0.005);
        function.countSteps();
        function.createXs();
        function.createYs();
        // index 0
        assertEquals(0.7, function.getXFromArray(0));
        assertEquals(-12.74633, function.getYFromArray(0), 0.00001);

        //index 120
        assertEquals(1.3, function.getXFromArray(120));
        assertEquals(11.60628, function.getYFromArray(120), 0.00001);

        //index 260
        assertEquals(2.0, function.getXFromArray(260));
        assertEquals(2.73264, function.getYFromArray(260), 0.00001);
    }

    @Test
    void testFunction4() throws Exception {
        Function function = new Function(1.65, 1, 5, 0.5);
        function.countSteps();
        function.createXs();
        function.createYs();
        System.out.println(Arrays.toString(function.getYs()));
        System.out.println("Сума усіх значень функції: " + function.findSum());
        System.out.println("Середнє арифметичне елементів масиву значень функції: " + function.findArithmeticMean());
    }

    @Test
    void testFunction5() throws Exception {
        Function function = new Function(1.65, 1, 5, 0.5);
        function.countSteps();
        function.createXs();
        function.createYs();
        System.out.println(Arrays.toString(function.getYs()));
        System.out.println(function.getYFromArray(function.findMinY()));
        System.out.println(function.getYFromArray(function.findMaxY()));
    }


}