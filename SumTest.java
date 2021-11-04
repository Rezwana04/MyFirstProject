
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void test() {
		Sum ss = new Sum();
		double actual = ss.addition(-1, 1);
		double expected =0;
		assertEquals(expected, actual);
	}

}
