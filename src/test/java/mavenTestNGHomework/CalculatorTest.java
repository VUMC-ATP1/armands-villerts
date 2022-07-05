package mavenTestNGHomework;

import homework.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class CalculatorTest {

    private Calculator calc1 = new Calculator();

    @BeforeMethod(alwaysRun = true)
    public void printMethodName(Method method) {
        System.out.println("Running: " + method.getName());

    }

    @Test
    public void testEverything() {
        Assert.assertEquals(calc1.add(10, 30), 40);
        Assert.assertEquals(calc1.subtract(50, 20), 30);
        Assert.assertEquals(calc1.multiply(5, 4), 20);
        Assert.assertEquals(calc1.divide(60, 6), 10);

    }

    @Test
    public void testAddition() {
        Assert.assertEquals(calc1.add(10, 30), 40);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calc1.subtract(50, 20), 30);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(calc1.multiply(5, 4), 20);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calc1.divide(60, 6), 10);
    }
}