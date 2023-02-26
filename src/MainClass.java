import org.junit.Test;
public class MainClass
{
    String a = "Hello, world";
    @Test
    public void getClassString()
    {
        String a = class_string();
    }
    private String class_string()
    {
        return a;
    }
}