package second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created on 02.05.2017.
 */
public class Range {

    private int start;
    private int end;

    public Range(int start, int end) {
        assert start < end;
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean isBefore(Range otherRange) {
        return end < otherRange.getStart();
    }

    public boolean isAfter(Range otherRange) {
        return start > otherRange.getEnd();
    }

    public boolean isConcurrent(Range otherRange) {
        return end < start;
    }

    public long getLowerBound(){
        return -1;
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

