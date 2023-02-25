import org.junit.Test;
public class MainClass
{
    int a=takeLocalNumber();
    @Test
    public void getLocalNumber()
    {
        int a = takeLocalNumber();
        System.out.println(a);
    }
    public int takeLocalNumber()
    {
        return 14;
    }
}
