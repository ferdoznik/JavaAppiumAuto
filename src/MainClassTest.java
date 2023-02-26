import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void  testGetClassString()
    {
        if (a.contains ("Hello")){System.out.println("The message contains 'Hello'");}
        else if (a.contains ("hello")){System.out.println("The message contains 'hello'");}
        else Assert.fail("The message doesn't contain Hello");
    }
}
