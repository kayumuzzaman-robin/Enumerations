package learn.java;

public enum Fruits {
    BANANA("Yellow"), APPLE("Red"), ORANGE;
    private final String color;

    //  enum constructor is always private as we can't change or make multiple object of enum because
    //  we cant create new object of enum. for every enum value, this constructor will get called & set the custom
    //  value of enum to color variable
    Fruits(String color) {
        this.color = color;
    }

    //  if any enum has no custom value like enum ORANGE, this constructor will set the value to that enum
    Fruits() {
        this.color = "default";
    }

    public String getColor() {
        return color;
    }
}
