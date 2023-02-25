import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int result = a;
        if (result !=14){
            Assert.fail("Didn't get 14");
        }
}
}
