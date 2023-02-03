/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

public record Time(int minutes, int seconds) {

    public Time {
        if (seconds >= 60) {
            int additionalMinutes = seconds / 60;
            minutes += additionalMinutes;
            seconds -= additionalMinutes * 60;
        }
    }
}

var time = new Time(12, 67);
