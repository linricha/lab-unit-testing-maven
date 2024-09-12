package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  // @Test
  // public void test2() {
  //   assertEquals(10, 3*5, "stupid test");
  // } // test2()

  @Test
  void sampleTemp1(){
    assertEquals(32, SampleMethods.c2f(0));
  }

  @Test
  void sampleTemp2(){
    assertEquals(212, SampleMethods.c2f(100));
  }

  @Test
  void sampleSum1(){
    int[] values = { 1, 2, 3 };
    assertEquals(6, SampleMethods.sum(values));
  }

  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes

  //@Test
  public void testExpt(){
    int expected = 1;
    int K = 5;
    for (int power = 0; power < K; power++) {
      assertEquals(expected, SampleMethods.expt(2, power));
      expected = expected * 2;
    }
  }

  //@Test
  public void testExpt1(){
    int expected = 1;
    int K = 20;
    for (int i = -10; i < 10; i++){
      expected = 1;
      for (int power = 0; power < K; power++) {
        assertEquals(expected, SampleMethods.expt(i, power));
        expected = expected * i;
      }
    }
  }

  @Test
  public void testExpt3(){
    assertEquals(1024, SampleMethods.expt(2, 10), "1K");
  }


  @Test
  public void testNoAs1(){
    assertEquals("", SampleMethods.removeAs("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }

  @Test
  public void testNoAs2(){
    assertEquals("b", SampleMethods.removeAs("aaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }

  @Test
  public void testNoBs1(){
    assertEquals("", SampleMethods.removeBs("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
  }

  @Test
  public void testNoBs2(){
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
  }

  /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs



  

} // class TestSampleMethods


