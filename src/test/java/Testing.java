
import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		if(myapp.JavaClass.add(2, 6)!=8) {
			fail("wrong answer");
		}
		}
	@Test
	public void test2() {
		if(myapp.JavaClass.sub(9, 6)!=3) {
			fail("wrong answer");
		}
		}

}
