package learn.java;

import java.util.Arrays;

/**
 * Enum
 */
public class Test {
    Days day;

    public Test(Days day) {
        this.day = day;
    }

    public Days getDays() {
        return day;
    }

    @Override
    public String toString() {
        return "Test{" +
                "day=" + day +
                '}';
    }

    public static void checkDay(Days day) {
        switch (day) {
            case FRIDAY:
            case SATURDAY:
                System.out.println("Good Day");
                break;
            case SUNDAY:
                System.out.println("Work start day");
                break;
            default:
                System.out.println("Work day");
        }
    }


    public static void main(String[] args) {
//      access enum by enum name Days.SUNDAY
        System.out.println("\n" + Days.SUNDAY);
//      assign enum to enum type
        Days friday = Days.FRIDAY;
        System.out.println(friday);

//      create test object with enum
        Test test = new Test(Days.TUESDAY);

        System.out.println("\n" + test.toString() + "\n");

        Test.checkDay(Days.SUNDAY);

        System.out.println("\n" + Arrays.toString(Fruits.values()) + "\n");
        System.out.println("Values of Apple: " + Fruits.valueOf("APPLE") + "\n");


//        this will throw error:   Exception in thread "main" java.lang.IllegalArgumentException: No enum constant learn.java.Fruits.Kasem
//        System.out.println("Values of Kasem: " + Fruits.valueOf("Kasem"));

        Fruits[] fruits = Fruits.values();

        for (Fruits fruit : fruits) {
            System.out.println(fruit.name() + " has color: " + fruit.getColor());
        }

        System.out.println();
//      access the custom value of enum by getter
        System.out.println(Fruits.BANANA.getColor());

    }
}
