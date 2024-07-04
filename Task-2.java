public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student(1);
        Student student3 = new Student(2, "radwan");
        Student student4 = new Student("kazi");
        Main student5 = new Main();

        System.out.println("Student 1:");
        student1.display();
        System.out.println();

        System.out.println("Student 2:");
        student2.display();
        System.out.println();

        System.out.println("Student 3:");
        student3.display();

        System.out.println("Student 4:");
        student4.display();
       
        student5.print("Rayhan");
        
    }
    public void print(String name){
        System.out.println("Brother Name: "+ name);
    }
    
}
