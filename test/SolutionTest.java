
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructFormattingSolutionTest1(){

        String expected = "java               100";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contructFormattingSolutionTest2(){

        String expected = "cpp               065";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void contructFormattingSolutionTest3(){

        String expected = "python             050";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
