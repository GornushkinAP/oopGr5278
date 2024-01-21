import java.util.ArrayList;

import domain.classes.Employee;
import domain.classes.Person;
import domain.classes.Student;
import domain.classes.StudentGroup;
import domain.classes.StudentStream;
import domain.classes.Teacher;
import servises.TeacherService;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import controllers.AccountController;

public class Main {
    public static void main(String[] args) {
        // Создаем студентов
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

        // Создаем списки студентов для каждой группы
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(student1);
        list2.add(student2);
        list2.add(student3);
        list2.add(student4);

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(student7);
        list1.add(student8);
        list1.add(student9);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student13);
        list.add(student14);
        list.add(student15);
        list.add(student16);
        list.add(student17);
        list.add(student18);

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.addAll(list);
        allStudents.addAll(list1);
        allStudents.addAll(list2);

        // Создаем группы студентов
        StudentGroup group1 = new StudentGroup(list, 786, "Экономисты");
        StudentGroup group2 = new StudentGroup(list1, 34, "Бухгалтеры");
        StudentGroup group3 = new StudentGroup(list2, 343, "Программисты");

        // Создаем список групп
        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        // Выводим инфо о каждой группе
        // // System.out.println(groups);
        // for (StudentGroup group : groups){
        // System.out.println(group);
        // }

        System.out.println("------------------------------------------------------");

        // Collections.sort((StudentStream) groups).getGroups();

        // // Создаем поток студентов и выводим информацию о каждой группе и ее
        // студентах
        // StudentStream stream = new StudentStream(1, groups);
        // for (StudentGroup group : stream) {
        // System.out.println("Stream number = " + stream.getStreamId() + " Group name:
        // " + group.getGroupName());
        // System.out.println("Students:");
        // for (Student student : group.getList()) {
        // System.out.println("- " + student.getName());
        // }
        // }

        // // Сортируем и выводим группы по количеству студентов
        // stream.sortGroups();
        // System.out.println("\n Sorted groups by number of students:");
        // for (StudentGroup group : stream) {
        // System.out.println("Group: " + group.getGroupName() + ", Number of students:
        // " + group.getList().size());
        // }

        // Создаем учителей
        Teacher t1 = new Teacher("Федор", 50, "Doctor");
        Teacher t2 = new Teacher("Евгений", 70, "Docent");
        Teacher t3 = new Teacher("Денис", 35, "Doctor 2");
        Teacher t4 = new Teacher("Геннадий", 85, "Academic");
        Teacher t5 = new Teacher("Вера", 40, "Laborant");

        // Создаем работников
        Employee e1 = new Employee("Fedor", 18, "Dvornik");
        Employee e2 = new Employee("Вася", 25, "Техник");
        Employee e3 = new Employee("Евгений", 35, "Электрик");
        Employee e4 = new Employee("Саша", 45, "Плотник");
        Employee e5 = new Employee("Игорь", 22, "Курьер");

        // AccountController controller = new AccountController();
        // controller.paySalary(t1,50000);
        // controller.paySalary(e1, 25000);
        // controller.paySalary(student1,20000);
        // AccountController.paySalary(t1, 25000);
        // AccountController.paySalary(e1, 25000);

        // Создаем список учителей
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);

        // Создаем список работников
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);


        System.out.println(teachers);
        System.out.println("------------------------------------------------------");
        TeacherService teachServ = new TeacherService();
        teachServ.getAll().addAll(teachers);
        teachServ.sortByFIO();
        System.out.println("------------------------------------------------------");
        

        System.out.println("Поиск среднего возраста: ");
        System.out.println("------------------------------------------------------");
        System.out.println("Учителя: ");
        AccountController.averageAge(teachers);
        System.out.println("------------------------------------------------------");
        System.out.println("Работники: ");
        AccountController.averageAge(employees);
        System.out.println("------------------------------------------------------");
        System.out.println("Студенты: ");
        AccountController.averageAge(allStudents);

    }
}
