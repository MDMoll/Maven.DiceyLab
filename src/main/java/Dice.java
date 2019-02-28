public class Dice {
    private int numberOfDice;
    private int numberOfSides;

    public Dice(int numberOfDice, int numberOfSides) {
        this.numberOfDice = numberOfDice;
        this.numberOfSides = numberOfSides;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            sum += roll();
        }
        return sum;
    }

    public int roll() {
        return ((int) (Math.random() * numberOfSides) + 1);
    }
}