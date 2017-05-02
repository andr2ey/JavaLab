package second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created on 02.05.2017.
 */
public class Range {

    private long start;
    private long end;

    public Range(long start, long end) {
        assert start < end && start >= 0 && end > 0;
        this.start = start;
        this.end = end;
    }

    public boolean isBefore(Range otherRange) {
        return end < otherRange.getLowerBound();
    }

    public boolean isAfter(Range otherRange) {
        return start > otherRange.getUpperBound();
    }

    public boolean isConcurrent(Range otherRange) {
        return start <= otherRange.getUpperBound() && end >= otherRange.getUpperBound() ||
                start <= otherRange.getLowerBound() && end >= otherRange.getUpperBound();
    }

    public long getLowerBound(){
        return start;
    }

    public long getUpperBound() {
        return end;
    }

    public boolean contains(long value) {
        return value <= end && value >= start;
    }

    public List<Long> asList() {
        List<Long> currentList = new ArrayList<>();
        for(long i = start; i <= end; i++) {
            currentList.add(i);
        }
        return currentList;
    }

    public Iterator<Long> asIterator() {
        return asList().iterator();
    }
}

