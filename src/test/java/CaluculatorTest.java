import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
public class CaluculatorTest {
    private Main caluculator;
    @Before
    public  void setup(){caluculator=new Main();}
    @Test
    public void test_add_positive(){
        double a = 1;
        double b = 2;
        double expectedResult = 3;
        Assert.assertEquals(expectedResult, caluculator.add(a,b),0.01);
    }
    @Test
    public void test_add_negative(){
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, caluculator.add(a,b),0.01);
    }
    @Test
    public void test_sub_positive(){
        double a = 4;
        double b = 2;
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, caluculator.sub(a,b),0.01);
    }
    @Test
    public void test_sub_negative(){
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, caluculator.sub(a,b),0.01);
    }
    @Test
    public void test_mul_positive(){
        double a = 1;
        double b = 2;
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, caluculator.mul(a,b),0.01);
    }
    @Test
    public void test_mul_negative(){
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, caluculator.mul(a,b),0.01);
    }
    @Test
    public void test_div_positive(){
        double a = 4;
        double b = 2;
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, caluculator.divison(a,b),0.01);
    }
    @Test
    public void test_div_negative(){
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, caluculator.divison(a,b),0.01);
    }
    @Test
    public void test_pow_positive(){
        double a = 1;
        double b = 2;
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, caluculator.power(a,b),0.01);
    }
    @Test
    public void test_pow_negative(){
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, caluculator.power(a,b),0.01);
    }
    @After
    public void teardown()
    {
        caluculator=null;
    }

}
