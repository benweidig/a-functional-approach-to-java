/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public class DataScrubbing {

    record Time(int minutes, int seconds) {

        Time {
            if (seconds >= 60) {
                int additionalMinutes = seconds / 60;
                minutes += additionalMinutes;
                seconds -= additionalMinutes * 60;
            }
        }
    }

    public static void main(String... args) {

        var time = new Time(12, 67);
        System.out.println(time);
    }
}
