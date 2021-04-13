package learn.java;

public enum Days {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

    //    If create an enum by Days day = Days.SUNDAY, constructor will be called for each values of this enum
    Days() {
        System.out.println("This day is: " + this.toString());
    }
}
