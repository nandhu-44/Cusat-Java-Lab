import java.util.logging.Level;
import java.util.logging.Logger;

public class Incrementer extends Thread {
    Counter counter;

    public Incrementer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (true) {
            try {
                counter.increment();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Incrementer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}