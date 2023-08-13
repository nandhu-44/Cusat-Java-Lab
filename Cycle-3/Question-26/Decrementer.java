import java.util.logging.Level;
import java.util.logging.Logger;

public class Decrementer extends Thread {
    Counter counter;

    public Decrementer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (true) {
            try {
                counter.decrement();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Decrementer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}