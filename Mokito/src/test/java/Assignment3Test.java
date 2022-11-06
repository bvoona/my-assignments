import org.junit.Test;

	public class Assignment3Test {
	    Assignment3 m1;

	    @BeforeEach
	 public void init() { m1 = new Assignment3();
	    }

	    @Test
	 public void test() {
	        int actual = m1.withdraw(4000);

	    }

	}
