package access;

public class Student {
    private String name;
    private int age;

    public Student() {
        this("John Doe", 18);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
