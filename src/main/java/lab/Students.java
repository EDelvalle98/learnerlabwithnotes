package lab;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(1, "Alexandria"));
        add(new Student(2, "Ethan"));
        add(new Student(3, "Dayquon"));
        add(new Student(4, "Mahogany"));
        add(new Student(5, "Treasure"));
        add(new Student(6, "Chaela"));
        add(new Student(7, "Collins"));
        add(new Student(8, "Daryna"));
        add(new Student(9, "Ryan"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
