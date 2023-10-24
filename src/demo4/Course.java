package demo4;

public class Course {
    int id;
    int lever;

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", lever=" + lever +
                '}';
    }
}
