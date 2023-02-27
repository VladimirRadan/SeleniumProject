import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTest {


    @BeforeClass
    public void setupClassLevel(){
        System.out.println("pre svih metoda samo jednom");
    }


    @BeforeMethod
    public void setup(){
        System.out.println("Pre svake metode");
    }


    @Test
    public void test1(){
        System.out.println("test 1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }

    @Test
    public void test3(){
        System.out.println("test 3");
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("nakon svake metode");
    }






}
