import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.ModelHashMap;
import Model.Domain.Student;
import View.ViewClassEng;
import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {

        // Создаем студентов
        Student student1 = new Student("Андрей", 18);
        Student student2 = new Student("Ольга", 20);
        Student student3 = new Student("Александр", 19);
        Student student4 = new Student("Егор", 28);

        Student student5 = new Student("Ирина", 17);
        Student student6 = new Student("Клава", 18);
        Student student7 = new Student("Петр", 22);

        Student student8 = new Student("Полина", 25);
        Student student9 = new Student("Денис", 38);
        Student student10 = new Student("Дмитрий", 19);
        Student student11 = new Student("Екатерина", 18);
        Student student12 = new Student("Вера", 18);
        Student student13 = new Student("Галина", 21);
        Student student14 = new Student("Ирина", 23);

        // Создаем списok студентов
        // List<Student> list = new ArrayList<>();
        // list.add(student1);
        // list.add(student2);
        // list.add(student3);
        // list.add(student4);
        // list.add(student5);
        // list.add(student6);
        // list.add(student7);
        // list.add(student8);
        // list.add(student9);
        // list.add(student10);
        // list.add(student11);
        // list.add(student12);
        // list.add(student13);
        // list.add(student14);
        // Создаем HashMap студентов
        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);
        studentMap.put(student6.getId(), student6);
        studentMap.put(student7.getId(), student7);
        studentMap.put(student8.getId(), student8);
        studentMap.put(student9.getId(), student9);
        studentMap.put(student10.getId(), student10);
        studentMap.put(student11.getId(), student11);
        studentMap.put(student12.getId(), student12);
        studentMap.put(student13.getId(), student13);
        studentMap.put(student14.getId(), student14);

        // Создаем объект модели с данными из списка
        // iGetModel model = new ModelClass(list);
        iGetModel model = new ModelHashMap(studentMap);

        // Создаем объекты представления
        ViewClass view = new ViewClass();
        ViewClassEng engView = new ViewClassEng();// Создаем объект ViewClassEng

        // Создаем объект модели, работающей с файлом
        iGetModel fmodel = new ModelClassFile("StudentDB.csv");
        // ModelClassFile newFile = new ModelClassFile(null)

        // Создаем объект контроллера, связываем его с моделью и представлением
        // ControllerClass controller = new ControllerClass(fmodel, engView);// Используем engView вместо view
        ControllerClass contr = new ControllerClass(model, view);// Используем engView вместо view

        // Устанавливаем контроллер в представление
        // engView.setContr(controller);
        view.setContr(contr);

        // Запускаем основной цикл представления
        // engView.ViewRun();
        view.ViewRun();

        // Запускаем основной цикл контроллера
        // controller.run();
        contr.run();

        // ControllerClass engController = new ControllerClass(fmodel, engView);
        // view.setContr(engController);
        // view.ViewRun();

        // engController.run();
    }

}
