import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {

	@Test
	public void testSuma() {
		Main main = new Main();
		int total = main.suma(3, 2);
		assertEquals(5, total);
	}

}
