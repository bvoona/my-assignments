import static org.junit.Assert.*;

import org.junit.Test;



public class TestMaxMinFind {
	MinMaxFind m1;
    @BeforeEach
    public void init() { m1 = new MinMaxFind(); }
    @Test
    public void findMixMax()
    {
        int[] sample={33,7,1,9};
        int[] expected={1,33};
        int[] actual =m1.findMinMax(sample);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void findMax(){
        int[] sample = {33,7,1,9};
        int expected = 1;
        int actual=m1.minimum(sample);
        assertEquals(expected,actual);
    }

}
