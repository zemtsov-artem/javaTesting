package none;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by artemon on 29.03.17.
 */
@RunWith(Parameterized.class)
public class PhibonachyClassTest {

    int expected;
    int input;

    public PhibonachyClassTest (int in, int ex) {
        this.expected = ex;
        this.input = in;
    }

    @Parameterized.Parameters
    public static Collection numbers()
    {
        return Arrays.asList(new Object[] [] {
                {1, 0},
                {2, 1},
                {3, 1},
                {4, 2},
                {5, 3},
                {6, 5} });
    }

    @Test
    public void test() {
        assertEquals(expected, PhibonachyClass.getPhibValuebyNum(input));
    }
}

