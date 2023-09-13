package demo1;

public class Student {
    private String id;
    private String name;
    private String gender;
    private int english;
    private int math;

    public Student() {
    }

    public Student(String id, String name, String gender, int english, int math) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.english = english;
        this.math = math;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return id + "\t\t" + name + "\t\t" + gender + "\t\t" + english + "\t\t" + math;
    }
}

