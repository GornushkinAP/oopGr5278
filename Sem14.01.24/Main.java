import java.util.ArrayList;
import java.util.Collections;

import domain.classes.Employee;
import domain.classes.Student;
import domain.classes.StudentGroup;
import domain.classes.StudentStream;
import domain.classes.Teacher;
import controllers.AccountController;

import java.util.List;

import controllers.AccountController;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Андрей", 18);
        Student student2 = new Student("Olga", 20);
        Student student3 = new Student("Sasha", 19);
        Student student4 = new Student("Егор", 28);


        Student student7 = new Student("Ирина", 17);
        Student student8 = new Student("Клава", 18);
        Student student9 = new Student("Петр", 22);
    
 

        Student student13 = new Student("Полина", 25);
        Student student14 = new Student("Денис", 38);
        Student student15 = new Student("Дмитрий", 19);
        Student student16 = new Student("Екатерина", 18);
        Student student17 = new Student("Вера", 18);
        Student student18 = new Student("Галина", 21);

        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
     
        List<Student> list1 = new ArrayList<>();
        list1.add(student7);
        list1.add(student8);
        list1.add(student9);
    
        List<Student> list2 = new ArrayList<>();
        list2.add(student13);
        list2.add(student14);
        list2.add(student15);
        list2.add(student16);
        list2.add(student17);
        list2.add(student18);


        // StudentGroup group = new StudentGroup(list, 1);
        // // System.out.println(group);
        // for (Student student : group){
        //     System.out.println(student);
        // }
        // System.out.println("------------------------------------------------------");
        // Collections.sort(group.getList());
        // for (Student student : group){
        //     System.out.println(student);
        // }


        StudentGroup group1 = new StudentGroup(list, 34, "Экономисты" );
        StudentGroup group2 = new StudentGroup(list1, 12, "Бухгалтеры" );
        StudentGroup group3 = new StudentGroup(list2, 343, "Программисты" );

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        // System.out.println(groups);
        for (StudentGroup group : groups){
            System.out.println(group);
        }

        System.out.println("------------------------------------------------------");

        // Collections.sort((StudentStream) groups).getGroups();

        StudentStream studentStream = new StudentStream(1, groups);
        for (StudentGroup group : studentStream) {
            System.out.println("Group: " + group.getGroupName());
            System.out.println("Students:");
            for (Student student : group()) {
                System.out.println("- " + student.getName());
            }
        }

        // Сортируем и выводим группы по количеству студентов
        studentStream.sortGroups();
        System.out.println("\nSorted groups by number of students:");
        for (StudentGroup group : studentStream) {
            System.out.println("Group: " + group.getGroupName() + ", Number of students: " + group.getStudents().size());
        }
    }


    Teacher t1 = new Teacher("Eduard", 50, "Doctor");
    Employee e1 = new Employee("Fedor", 35, "Dvornik");

    AccountController controller = new AccountController();
    controller.paySalary(t1,50000);
    controller.paySalary(e1, 25000);
    controller.paySalary(s1,20000);

   


}



