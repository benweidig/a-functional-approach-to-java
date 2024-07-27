//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record Time(int minutes, int seconds) {

    public Time {
        if (seconds >= 60) {
            int additionalMinutes = seconds / 60;
            minutes += additionalMinutes;
            seconds -= additionalMinutes * 60;
        }
    }
}

var time = new Time(12, 67)
System.out.println("scrubbed = " + time)
