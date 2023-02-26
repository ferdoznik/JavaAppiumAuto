import org.junit.Test;
public class MainClass
{
    int a = class_number();
    @Test
    public void getClassNumber()
    {
        int a = class_number();
        System.out.println(a);
    }
    private int class_number()
    {
        return 20;
    }
}