package Iterator;

public class FibonacciIterator implements java.util.Iterator<Integer> {

    /*
        *  Lukujono on täällä. Käytössä on vain yksi iteraattori, mutta tällä järjestelyllä niitä voisi olla useampi
        *  Ehkä sekavampi toteutus, koska jokaisella iteraattorilla on oma lukujono.
     */

    private FibonacciSequence sequence;
    private int current = 0;
    private int next = 1;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int temp = current;
        current = next;
        next = temp + next;
        return temp;
    }
}
