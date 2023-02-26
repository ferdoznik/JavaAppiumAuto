import org.junit.Test;
public class MainClass
{
    int a = 20;
    @Test
    public void getClassNumber()
    {
        int a = class_number();
        System.out.println(a);
    }
    private int class_number()
    {
        return a;
    }
}