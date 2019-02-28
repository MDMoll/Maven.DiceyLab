public class Main {
    public static void main(String[] args) {
        Sim simulation = new Sim(100, 100, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }
}