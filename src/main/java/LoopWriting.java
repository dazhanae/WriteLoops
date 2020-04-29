public class LoopWriting {

    private static final int _3 = 3;

    public int oneToFive() {
        int w = 0;
        for (int i = 1; i <=5; i++ )
        // Write a FOR loop that counts from 1 to 10.
        // calling
        w = w + 1;
        // each time through the loop

        // this will tell the test how many times the loop executed.
        return w;
    }

    public int oneToTen() {
        int w = 0;
        for (int a = 1; a <=5; a++ )
        // Write a FOR loop that counts from 1 to 10.
        // calling
        w = w + 1;
        // each time through the loop

        return w;
    }

    public int startAtTwentyOne() {
        int w = 0;

        // Write a FOR loop that makes 10 iterations, start at 21.
        // calling
        w = w + 1;
        // each time through the loop

        return w;
    }

    public int countDown() {
        int w = 0;
        // Write a FOR loop that counts down from 100 to 0.
        // calling
        w = w + 1;
        // each time through the loop

        return w;
    }

    public int byTwoTo32() {
        int w = 0;

        // Write a FOR loop from 0 to 32 by 2s.
        // calling
        w = w + 1;
        // each time through the loop
        return w;
    }

    public int countDownFrom5000() {
        int w = 0;

        // Write a FOR loop from 1 to less than 5001 by 11s.
        // calling
        w = w + 1;
        // each time through the loop

        return w;
    }

    public int nestedFors() {
        int w = 0;

        // Write a nested FOR loop(s), where one counts from
        // 0 to less than 20 and the inner one counts from 0 to 4
        // calling
        w = w + 1;
        // each time through the inner loop

        return w;
    }

    public int helloZipCode() {
        int w = 0;

        // Write a FOR loop that counts from 5 to 105. Put an IF
        // statement inside the loop that checks the
        // loop index counter and if it's greater than 51,
        // prints "Hello Zipcode" instead of the statement w = w + 1;

        // calling
        w = w + 1;
        // each time through the inner loop

        return w;
    }

    public void simpleLoops() {
        int i = 0;

        // sample while loop
        while (i <= 5) {
            System.out.println("Eww.");
            i = i + 1;
        }

        // sample do...while loop
        i = 8;
        do {
            System.out.println("Eww.");
            i = i - 1;
        } while (i > 0);
        // what's the primary difference between them?!?
    }

    // Write a WHILE loop that checks "gpsCurrentLocation()"
    // and if that is not equal to "Home" then and it calls "driveSomeMore()".
    // After the loop is done, print "Honey, I'm Home!"
    public int driveHome() {
        int w = 0;

        // you need to use a .equals for two Strings.

        // calling
        w = w + 1;
        // each time through the inner loop


        return w;
    }

    // Getting harder...
    // First declare and set "highestScore" to 236. Then set "currentScore" to
    // "gameNextScore()". Then write a WHILE loop that checks "runningScore"
    // is less than "highestScore" and if it is, adds "currentScore" to
    // "runningScore"
    // and then sets "currentScore" to "gameNextScore()"
    public int checkGameScore() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        // do your while loop here

        // calling
        w = w + 1;
        // each time through the inner loop

        return w; // >= 3;
    }

    private int gameNextScore() {
        return gameNextScore();
    }

    // Rewrite the previous WHILE loop as a DO..WHILE loop.
    // Notice how the "runningScore" variable usage is different.
    public boolean checkGameScoreDoWhile() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        // do your while loop here

        // calling
        w = w + 1;
        // each time through the inner loop

        return w >= 3;
    }

    // Write a WHILE loop that checks "serverIsRunning()" and if true
    // calls "waitFor(5)" After the loop, write an IF and check "serverIsRunning()"
    // is false, and if so, call "sendEmergencyText("Help!", adminPhoneNumber)"
    // and also calls "tryServerRestart()"
    public int checkServerStatus() {
        int w = 0;
        String adminPhoneNumber = "+1 202 456 1111";


        // calling
        w = w + 1;
        // each time through the inner loop

        return w;
    }




}

