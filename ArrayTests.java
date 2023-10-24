import static org.junit.Assert.*;
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
}
