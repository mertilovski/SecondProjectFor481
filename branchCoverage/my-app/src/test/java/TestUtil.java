import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test

  public void TestOneLength(){

    int[] arr = {1};
    boolean result = c.compute(arr);
    assertEquals(true,result == false);

  }

  @Test
  public void TestEvenLength(){

    int[] arr = {1,2};
    boolean result = c.compute(arr);
    assertEquals(true,result == false);

  }

  @Test
  public void TestEmpty(){

    int[] arr = {};
    boolean result = c.compute(arr);
    assertEquals(true,result == false);

  }

  @Test
  public void TestComputeCallWithZero(){

    int[] arr = {0,1,2};
    try{
      c.compute(arr);
    }catch(RuntimeException e){
        //no need for anything.
    }
  }



  @Test
  public void TestComputeCallOdd(){

    int[] arr = {1,2,3};
    assertEquals(true,c.compute(arr) == true);
  }
}