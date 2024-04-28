import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.testng.annotations.Test;

public class TestExample {

    @Step("Step 1")
    private void step1() { System.out.println("Step 1 done!"); }

    @Step("Step 2")
    private void step2() { System.out.println("Step 2 done !"); }

    @Test
    @QaseId(1)
    @QaseTitle("Test 1")
    public void test1() {
        step1();
        step2();
    }

    @Test
    @QaseId(2)
    @QaseTitle("Test 2")
    public void test2() {
        step1();
        step2();
    }
}
