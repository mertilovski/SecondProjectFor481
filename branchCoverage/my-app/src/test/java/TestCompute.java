import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void TestEmptyMq(){ 
    MessageQueue mq = mock(MessageQueue.class);
      c = new Compute(mq);
      int result = c.countNumberOfOccurrences("");
      assertEquals(true,result == -1);
  }

  @Test
  public void TestContains(){ 
    MessageQueue mq = mock(MessageQueue.class);
//      when(mq.size()).thenReturn(1);
      when(mq.contains("word")).thenReturn(true);
//     when(mq.getAt(0)).thenReturn("word");
      c = new Compute(mq);
      int result = c.countNumberOfOccurrences("word");
      assertEquals(true,result != 0);
  }
 
  
  @Test
  public void TestNotContains(){ 
    MessageQueue mq = mock(MessageQueue.class);
      when(mq.size()).thenReturn(1);
      when(mq.contains("word")).thenReturn(false);
      c = new Compute(mq);
      int result = c.countNumberOfOccurrences("word");
      assertEquals(true,result == 0);
  }
  
}