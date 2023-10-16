import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("deprecation")
public class AnalogClockApplet extends Applet {
    private ClockPanel clockPanel;

    public void init() {
        String startTimeParam = getParameter("startTime");
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        Date startTime;
        try {
            startTime = dateFormat.parse(startTimeParam);
        } catch (Exception e) {
            startTime = new Date();
        }

        clockPanel = new ClockPanel(startTime);
        add(clockPanel);
    }

    public void start() {
        clockPanel.startClock();
    }

    public void stop() {
        clockPanel.stopClock();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new ClockPanel(new Date()));
        frame.setVisible(true);
    }
}

class ClockPanel extends JPanel implements Runnable {
    private Thread clockThread;
    private Date currentTime;

    public ClockPanel(Date startTime) {
        currentTime = startTime;
    }

    public void startClock() {
        if (clockThread == null) {
            clockThread = new Thread(this);
            clockThread.start();
        }
    }

    public void stopClock() {
        if (clockThread != null) {
            clockThread.interrupt();
            clockThread = null;
        }
    }

    public void run() {
        try {
            while (true) {
                currentTime = new Date();
                repaint();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 10;
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        drawClockHands(g, centerX, centerY, radius);
    }

    private void drawClockHands(Graphics g, int centerX, int centerY, int radius) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);

        int seconds = calendar.get(Calendar.SECOND);
        int minutes = calendar.get(Calendar.MINUTE);
        int hours = calendar.get(Calendar.HOUR);

        int secondHandLength = radius - 10;
        int minuteHandLength = radius - 20;
        int hourHandLength = radius / 2;

        int hourAngle = (int) (360 * ((hours % 12) + (minutes / 60.0)) / 12);
        drawHand(g, centerX, centerY, hourAngle, hourHandLength);
        int minuteAngle = (int) (360 * ((minutes % 60) + (seconds / 60.0)) / 60);
        drawHand(g, centerX, centerY, minuteAngle, minuteHandLength);
        int secondAngle = (int) (360 * seconds / 60);
        drawHand(g, centerX, centerY, secondAngle, secondHandLength);
    }

    private void drawHand(Graphics g, int centerX, int centerY, int angle, int length) {
        double radianAngle = Math.toRadians(angle - 90);
        int x = (int) (centerX + length * Math.cos(radianAngle));
        int y = (int) (centerY + length * Math.sin(radianAngle));

        g.drawLine(centerX, centerY, x, y);
    }
}
