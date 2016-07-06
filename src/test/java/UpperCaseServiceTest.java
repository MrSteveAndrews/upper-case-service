import com.blueagility.example.strings.uppercase.service.UpperCaseService;
import com.blueagility.example.strings.uppercase.service.UpperCaseServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;


/**
 * Ensures UpperCaseService works correctly
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(UpperCaseServiceApplication.class)
public class UpperCaseServiceTest {

    @Autowired
    private UpperCaseService upperCaseService;

    @Test
    public void upper_case_abc() {
        String output = upperCaseService.upperCase("abc");
        assertEquals("ABC", output);
    }

    @Test
    public void upper_case_ABC() {
        String output = upperCaseService.upperCase("ABC");
        assertEquals("ABC", output);
    }

    @Test
    public void upper_case_AbC() {
        String output = upperCaseService.upperCase("AbC");
        assertEquals("ABC", output);
    }

    @Test
    public void upper_case_123() {
        String output = upperCaseService.upperCase("123");
        assertEquals("123", output);
    }

    @Test
    public void upper_case_abc123() {
        String output = upperCaseService.upperCase("abc123");
        assertEquals("ABC123", output);
    }

}
