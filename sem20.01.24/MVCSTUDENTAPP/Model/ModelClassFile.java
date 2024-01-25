package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

// Класс, реализующий модель приложения с сохранением данных в файл
public class ModelClassFile implements iGetModel {

    // Имя файла, в который будут сохраняться и извлекаться данные
    private String fileName;

    // Конструктор класса, принимающий имя файла
    public ModelClassFile(String fileName) {
        this.fileName = fileName;

        // Попытка создать файл, если его не существует
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод интерфейса iGetModel для получения списка студентов из файла
    // Возвращает список студентов
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            // Чтение данных из файла
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                // Разделение строки на параметры и создание объекта Student
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]));
                students.add(pers);
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    // Метод для сохранения списка студентов в файл
    public void saveAllStudentToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            // Запись данных каждого студента в файл
            for (Student pers : students) {
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
