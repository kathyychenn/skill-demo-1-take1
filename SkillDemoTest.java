import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void test1(){
        assertEquals("happy 49th birthday", SkillDemo.birthday(50));
    }
}
