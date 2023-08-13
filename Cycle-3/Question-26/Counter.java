public class Counter {

    private int limit;
    private int count;

    public Counter(int limit) {
        this.limit = limit;
        this.count = 0;
    }

    public synchronized void increment() {
        if (count < limit) {
            count++;
            System.out.println("Count incremented to " + count);
        } else {
            System.out.println("Limit reached, waiting for decrement...");
        }
    }

    public synchronized void decrement() {
        if (count > 0) {
            count--;
            System.out.println("Count decremented to " + count);
        } else {
            System.out.println("Count is 0, waiting for increment...");
        }
    }

}
