import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class ListTests{

	@Test 
	public void testListMerge() {
    List<String> testString1 = new ArrayList<String>();
    testString1.add("a");
    testString1.add("aaaaa");
    testString1.add("b");
    List<String> testString2 = new ArrayList<>();
    testString2.add("abc");
    testString2.add("azaz");
    testString2.add("cccc");
    List<String> expected = new ArrayList<>(Arrays.asList("a", "aaaaa","abc","azaz","b", "cccc"));
    assertEquals(expected, ListExamples.merge(testString1, testString2));
	}


  @Test
  public void testFilter() {
    List<String> testString1 = new ArrayList<>(Arrays.asList("a", "b", "c","g"));
    List<String> expected = new ArrayList<>(Arrays.asList("g"));
    testChecker testCheck = new testChecker();
    assertEquals(expected, ListExamples.filter(testString1, testCheck));
  }


}
