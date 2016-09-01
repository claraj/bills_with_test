import com.clara.BillAverage;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by admin on 9/1/16.
 */
public class BillDataDisplayTest {


    @Test
    public void testCreateDisplayArray(){

        String[] inputArray = { "a", "bbb", "cccc", "dd"};
        String[] expectedArray = { "a   ", "bbb ", "cccc", "dd  "};

        Assert.assertArrayEquals(expectedArray, BillAverage.padStringArray(inputArray, 4));

    }

    @Test
    public void testPadWithSpaces() {

        Assert.assertEquals("May       ", BillAverage.padWithSpaces("May", 10));
        Assert.assertEquals("May   ", BillAverage.padWithSpaces("May", 6));
        Assert.assertEquals("May", BillAverage.padWithSpaces("May", 2));
        Assert.assertEquals("May", BillAverage.padWithSpaces("May", 0));
        Assert.assertEquals("May", BillAverage.padWithSpaces("May", -10));

    }

    @Test
    public void testLongestString() {

        String[] testStrings = {"qwerty", "1234567890", "a", "lkjh"}; //Longest string is 10 characters long
        Assert.assertEquals(10, BillAverage.longestString(testStrings));


        String[] testStringJointEquals = {"aaa", "bbbbbb", "ccc", "dddddd"}; //Two equal longest Strings, Longest string is 6 characters long
        Assert.assertEquals(6, BillAverage.longestString(testStringJointEquals));


    }

}
