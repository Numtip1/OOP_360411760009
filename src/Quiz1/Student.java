package Quiz1;

public class Student {
    private String name;
    private String id;
    private String major;
    private double GPA;


    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, String id, String major, double GPA) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.GPA = GPA;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", GPA='" + GPA + '\'' +
                '}';
    }
}