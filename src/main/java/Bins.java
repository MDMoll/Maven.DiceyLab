import java.util.HashMap;
public class Bins {
    private HashMap<Integer, Integer> bins;

    public Bins(Integer min, Integer max) {
        this.bins = new HashMap<>();
        for (int i = min; i <= max; i++) {
            bins.put(i, 0);
        }
    }

    public Integer getBin(Integer binNumber) {
        return bins.get(binNumber);
    }

    public void incrementBin(Integer binNumber) {
        Integer adder = bins.get(binNumber);
        adder++;
        bins.put(binNumber, adder);
    }
}