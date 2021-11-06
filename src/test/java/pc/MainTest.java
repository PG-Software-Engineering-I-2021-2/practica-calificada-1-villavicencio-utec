package pc;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void main() {
        Main.main(new String[0]);
        Assert.assertTrue(true);
    }
}
