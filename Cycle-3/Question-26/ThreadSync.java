public class ThreadSync {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        Incrementer incrementer = new Incrementer(counter);
        Decrementer decrementer = new Decrementer(counter);
        incrementer.start();
        decrementer.start();
    }
}