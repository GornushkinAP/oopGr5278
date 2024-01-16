package servises;

import java.util.ArrayList;
import java.util.List;

import domain.classes.PersonComparator;
import domain.classes.Student;

public class StudentService implements iPersonService<Student>{
    
    private int count;
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }


    public void sortByFIO(){
        PersonComparator<Student> studComp = new PersonComparator<>();
        students.sort(studComp);
    }


    
    
}
