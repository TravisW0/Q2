import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
		TuitionCalculator obj = new TuitionCalculator();
		int result = obj.totalCost(12520, .01);
		Assert.assertEquals(50580, result);
	}

}
