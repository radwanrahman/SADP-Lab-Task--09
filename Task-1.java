public class Student {
    private int id;
    private String name;

    public Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    public Student(int id) {
        this.id = id;
        this.name = "Unknown";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Student(String name) {
        this.id = 0;
        this.name = name;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

}
