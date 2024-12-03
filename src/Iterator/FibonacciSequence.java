package Iterator;

import java.util.Iterator;

public class FibonacciSequence implements SequenceInterface{

    /*  Lukujonoa ei pidetä täällä, vaan FibonacciIteratorissa
     *  Jos lukujono olisi täällä, voisi useampi iteraattori käsiteellä samaa lukujonoa
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }
}
