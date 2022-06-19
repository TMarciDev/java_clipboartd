import java.util.Timer;
import java.util.TimerTask;

import static java.lang.System.exit;

public class Main {

    public static void main(String args[]) throws Exception {

        final int[] counter = {0};
        final int MAX = 100;
        TimerTask timerTask = new TimerTask()
        {
            public void run()
            {
                if(counter[0] < MAX) {
                    MyThread myThread = new MyThread();
                    myThread.start();
                    counter[0]++;
                } else {
                    exit(0);
                }

            }
        };

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(timerTask, 0, 1000);

    }
}
