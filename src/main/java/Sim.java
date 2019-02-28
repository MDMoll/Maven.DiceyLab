public class Sim {
    private int numberOfDice;
    private int numberOfSides;
    private int numberOfThrows;
    private Bins newBins;

    public Sim(int numberOfDice, int numberOfSides, int numberOfThrows) {
        this.numberOfDice = numberOfDice;
        this.numberOfSides = numberOfSides;
        this.numberOfThrows = numberOfThrows;
    }

    public void runSimulation() {
        Dice die = new Dice(numberOfDice, numberOfSides);
        Bins bins = new Bins(numberOfDice, (numberOfDice * numberOfSides));
        for (int i = 0; i < numberOfThrows; i++) {
            bins.incrementBin(die.tossAndSum());
        }
        this.newBins = bins;
    }

    public void printResults() {
        System.out.println(numberOfDice + " simulated dice with " + numberOfSides + " sides tossed " + numberOfThrows + " times.\n");
        for (int i = numberOfDice; i < (numberOfDice * numberOfSides * numberOfThrows); i++) {
            printBinLine(i);
        }
    }

    public void printBinLine(int i) {
        Double percent = (double) newBins.getBin(i) / numberOfThrows;
        System.out.println(String.format("%3d : %9d: %2.2f %s", i, newBins.getBin(i), percent, getStars(percent))); }

    private String getStars(Double percentage) {
        String starLine = "";
        for (Double i = 0.00; i < percentage; i += 0.01) {
            starLine += "*";
        }
        return starLine;
    }
}