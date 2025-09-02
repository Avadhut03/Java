package RelationShips;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student("Om");
        Student s2= new Student("Shri");
        Student s3= new Student("John");
        Student s4= new Student("Doe");
        Student s5= new Student("Chris");

        List<Student> class1= new ArrayList<>();
        class1.add(s1);
        class1.add(s2);

        List<Student> class2= new ArrayList<>();
        class2.add(s3);
        class2.add(s4);
        class2.add(s5);

        Teacher t1= new Teacher("Shital", class1);
        Teacher t2= new Teacher("Manoj",class2);

        System.out.println("Teacher 1 students ");
        t1.ShowStudents();

        System.out.println("Teacher 2 Students ");
        t2.ShowStudents();

    }

}
