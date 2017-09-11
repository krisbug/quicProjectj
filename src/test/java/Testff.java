import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by kb on 2017-09-11.
 */
@RunWith(MockitoJUnitRunner.class)
public class Testff {

    @Mock
    private A a;

    @Test
    public void jfskdljfs() {
        Comparable<Integer> c= mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        //assert
        assertEquals(-1, c.compareTo(9));

       // A b = mock(A.class);

        when(a.method()).thenReturn("uuuu");

        String s = a.method();



        assertEquals(s, "uuuu");



    }


}
