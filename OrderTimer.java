import java.util.Timer;
import java.util.TimerTask;
public class OrderTimer {
    private int remainingTime;
    public OrderTimer(int remainingTime) {

        this.remainingTime = remainingTime;
    }

    public void startTimer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                if (remainingTime > 0) {
                    int minutes = remainingTime / 60;
                    int seconds = remainingTime % 60;


                    if(remainingTime == 120) { // 30 minutes
                        System.out.println("Your order is placed...\n");
                    }
                    if(remainingTime == 100) {
                        System.out.println("\rYour order is preparing...\n");
                    }
                    if (remainingTime == 60) { // 15 minutes
                        System.out.println("\rDriver on the way...\n");
                    }
                    System.out.printf("\r --> Time remaining: %02d : %02d\r", minutes, seconds);
                    remainingTime--;

                } else {
                    System.out.println("\nDelivered");
                    timer.cancel();
                }
            }

        };

        // this method to specify the way to display the time and the period between each cycle.
        timer.scheduleAtFixedRate(task, 0, 1000); // execute the changes every 1 second automatically.

    }
}