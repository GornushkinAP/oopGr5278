import java.util.ArrayList;

import domain.classes.Student;
import domain.classes.StudentGroup;
import domain.classes.StudentStream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создаем студентов
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

        //Создаем списки студентов для каждой группы
        List<Student> list2 = new ArrayList<>();
        list2.add(student1);
        list2.add(student2);
        list2.add(student3);
        list2.add(student4);
     
        List<Student> list1 = new ArrayList<>();
        list1.add(student7);
        list1.add(student8);
        list1.add(student9);
    
        List<Student> list = new ArrayList<>();
        list.add(student13);
        list.add(student14);
        list.add(student15);
        list.add(student16);
        list.add(student17);
        list.add(student18);


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

        //Создаем группы студентов
        StudentGroup group1 = new StudentGroup(list, 786, "Экономисты" );
        StudentGroup group2 = new StudentGroup(list1, 34, "Бухгалтеры" );
        StudentGroup group3 = new StudentGroup(list2, 343, "Программисты" );

        //Создаем список групп
        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        //Выводим инфо о каждой группе
        // System.out.println(groups);
        for (StudentGroup group : groups){
            System.out.println(group);
        }

        System.out.println("------------------------------------------------------");
        
        // Collections.sort((StudentStream) groups).getGroups();

        // Создаем поток студентов и выводим информацию о каждой группе и ее студентах
        StudentStream stream = new StudentStream(1, groups);
        for (StudentGroup group : stream) {
                System.out.println("Stream number = " + stream.getStreamId() + " Group name: " + group.getGroupName());
       System.out.println("Students:");
            for (Student student : group.getList()) {
                System.out.println("- " + student.getName());
            }
        }

        // Сортируем и выводим группы по количеству студентов
        stream.sortGroups();
        System.out.println("\n Sorted groups by number of students:");
        for (StudentGroup group : stream) {
            System.out.println("Group: " + group.getGroupName() + ", Number of students: " + group.getList().size());
        }

    }
    }



