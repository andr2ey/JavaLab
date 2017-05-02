package second;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RangeTest {

    private static final long START = 2;
    private static final long END = 3;
    private Range current = new Range(START, END);

    @Test
    void whenCurrentIsBeforeRangeFourAndFiveThenTrue() throws Exception {
        assertTrue(current.isBefore(new Range(4, 5)));
    }

    @Test
    void whenCurrentIsAfterRangeZeroAndOneThenTrue() throws Exception {
        assertTrue(current.isAfter(new Range(0, 1)));
    }

    @Test
    void whenCurrentIsConcurrentWithRangeZeroAndTwoThenTrue() throws Exception {
        assertTrue(current.isConcurrent(new Range(0, 2)));
    }

    @Test
    void whenGetCurrentLowerBoundaryThenTwo() throws Exception {
        assertThat(current.getLowerBound(), is(START));
    }

    @Test
    void whenGetCurrentUpperBoundaryThenThree() throws Exception {
        assertThat(current.getUpperBound(), is(END));
    }

    @Test
    void whenCurrentContainThreeThenTrue() {
        assertTrue(current.contains(END));
    }

    @Test
    void whenListOfCurrentContainAllValuesThenTrue() {
        List<Long> list = current.asList();
        List<Long> currentList = list();
        assertAll(()-> assertTrue(list.size() == currentList.size()),
                ()-> list.containsAll(currentList));
    }

    @Test
    void asIterator() {
        List<Long> currentList = list();
        Iterator<Long> iterator = current.asIterator();
        for (long value : currentList) {
            assertTrue(value == iterator.next());
        }
        assertFalse(iterator.hasNext());
    }

    private List<Long> list() {
        List<Long> currentList = new ArrayList<>();
        for(long i = START; i <= END; i++) {
            currentList.add(i);
        }
        return currentList;
    }


}
