import org.junit.After;
import org.junit.Test;

public class Assignment4Test {
	Assignment4 t1;

    @BeforeEach
    public void beforeAllInIt() {
        System.out.println("Before Test should work");
    }

    @BeforeEach
   public void intIt() {
        t1=new Assignment4();
    }
    @After
    public void clean() {
        System.out.println("Cleaning...");
    }

    @After
   public void after() {
        System.out.println("After all it should work");
    }

    @Test
  public  void sum() {
        assertEquals(4, t1.sum(2, 2), "Should return sum");
    }

    private void assertEquals(int i, int sum, String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void conCat() {
        assertEquals(6, t1.multiply(2, 3), "Should return multiplication");


    }
}