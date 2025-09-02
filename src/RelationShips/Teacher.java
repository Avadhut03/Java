package RelationShips;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String StudentName;
    Student(String StudentName){
        this.StudentName=StudentName;
    }
    public String getStudentName(){
        return StudentName;
    }
}
public class Teacher {
    private String TeacherName;
    List<Student> student= new ArrayList<>();
    Teacher(String name, List<Student> student){
        TeacherName= name;
        this.student=student;
    }
    public void ShowStudents(){
        System.out.println("Teacher " + TeacherName + " teaches:");
        for (Student s : student) {
            System.out.println("  " + s.getStudentName());
        }
    }
}


