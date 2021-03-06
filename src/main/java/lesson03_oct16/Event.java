package lesson03_oct16;

public class Event {

    public Event(int year, String name) {
        this.year = year;
        this.name = name;
    }

    private final int year;
    private final String name;

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
    boolean checkYear(int year){
        return year == this.year;
    }
}
