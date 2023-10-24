import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ArrayTests {

  @Test
  public void testReversedInPlaceMultiple() {
    int[] input1 = { 1, 2, 3 , 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1 }, input1);
  }

	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversedMultiple() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedSingle() {
    int[] input1 = { 42 };
    assertArrayEquals(new int[]{ 42 }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReversedEmpyt() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  // @Test
  // public void testAvarege() {
  //   double[] input1 = { -1, 1, 5, 6, 1, -1};
  //   assertEquals(2.4, ArrayExamples.averageWithoutLowest(input1), 0.001); 
  // }

  @Test
  public void testListTrueFilter() {
    List<String> input1 = new ArrayList<String>();
    input1.add("a");
    input1.add("b");
    input1.add("c");
    assertEquals(input1, ListExamples.filter(input1, new AlwaysTrueTester()));
  }

  @Test
  public void testListConditionalFilter() {
    List<String> input1 = new ArrayList<String>();
    input1.add("a");
    input1.add("ab");
    input1.add("b");
    List<String> outpu1 = new ArrayList<String>();
    outpu1.add("a");
    outpu1.add("b");
    assertEquals(outpu1, ListExamples.filter(input1, new SingleCharacterTester()));
  }
}

class AlwaysTrueTester implements StringChecker {
  
  @Override
  public boolean checkString(String s) {
     return true;
  }
}

class SingleCharacterTester implements StringChecker {
  
  @Override
  public boolean checkString(String s) {
    if (s.length() == 1) {
      return true;
    }
     return false;
  }
}