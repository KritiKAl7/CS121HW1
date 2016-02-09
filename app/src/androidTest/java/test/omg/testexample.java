package test.omg;

import android.test.InstrumentationTestCase;

/**
 * Created by KritiKAl on 2/8/2016.
 */
public class testexample extends InstrumentationTestCase{
    public void test() throws Exception {
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
    }
}
