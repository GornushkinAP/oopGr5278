import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Student<String, Integer> s1 = new Student<String,Integer>("Сергей", 21);
        Student<String, Integer> s2 = new Student<String,Integer>("Андрей", 23);
        Student<String, Integer> s3 = new Student<String,Integer>("Мария", 26);
        Student<String, Integer> s4 = new Student<String,Integer>("Ольга", 27);

        List<Student<String, Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        
        StudentGroup<String, Integer> list  = new StudentGroup<String,Integer>(listStud, 12, "Random");
        for (Student<String, Integer> stud : list)
        {
            System.out.println(stud);
        }


    }
}
