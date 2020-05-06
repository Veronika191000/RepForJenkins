import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void verifySum(){
        Assert.assertEquals(2+2, 4);
    }

    @Test
    public void verifyMul(){
        Assert.assertEquals(2*2, 4);
    }

    @Test
    public void verifyDiv(){
        Assert.assertEquals(6/3, 2);
    }

    @Test
    public void verifySub(){
        Assert.assertEquals(4-2, 2);
    }
}
