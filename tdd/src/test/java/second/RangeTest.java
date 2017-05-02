package second;

import org.junit.jupiter.api.Test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created on 02.05.2017.
 */
@RunWith(JUnitPlatform.class)
public class RangeTest {

    private Range range = new Range(2, 3);

    @Test
    public void isBefore() throws Exception {
        assertTrue(range.isBefore(new Range(4, 5)));
    }

    @Test
    public void isAfter() throws Exception {
        assertTrue(range.isAfter(new Range(0, 1)));
    }

    @Test
    public void isConcurrent() throws Exception {
    }

    @Test
    public void getLowerBound() throws Exception {
    }

    public long getUpperBound() {
        return -1;
    }

    public boolean contains(long value) {
        return false;
    }

    public List<Long> asList() {
        return new ArrayList<>();
    }

    public Iterator<Long> asIterator() {
        return asList().iterator();
    }


}
