package MyTestSuite;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import my.calculate.CalculatorTest;
import org.apache.commons.math3.util.MyMathArraysTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, MyMathArraysTest.class})
public class AllTest {
    public static Test suite(){
        TestSuite suite = new TestSuite("All JUnit test");
        suite.addTest(new JUnit4TestAdapter(MyMathArraysTest.class));
        suite.addTest(new JUnit4TestAdapter(CalculatorTest.class));
        return (Test) suite;
    }
//    public void testsuite(){
//        System.out.println("开始运行测试集");
//    }
}
