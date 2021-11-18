package my.calculate;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator cal=new Calculator();

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @org.junit.Test
    public void add() {
        cal.add(2,2);
        assertEquals(4,cal.getResult());
    }

    @org.junit.Test
    public void sub() {
        cal.sub(4,2);
        assertEquals(2,cal.getResult());
    }

    @org.junit.Test
    public void multiply() {
        cal.multiply(4,2);
        assertEquals(8,cal.getResult());
    }

    @org.junit.Test
    public void divide() {
        cal.divide(4,2);
        assertEquals(2,cal.getResult());
    }


}