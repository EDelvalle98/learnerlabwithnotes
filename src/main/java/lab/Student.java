package lab;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
