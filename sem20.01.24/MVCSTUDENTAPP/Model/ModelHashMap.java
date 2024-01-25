package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

// Класс, реализующий модель приложения с использованием HashMap для хранения студентов
public class ModelHashMap implements iGetModel {

    // HashMap для хранения студентов, ключ - идентификатор студента
    private HashMap<Integer, Student> students;

    // Конструктор класса, принимающий HashMap студентов
    public ModelHashMap(HashMap<Integer, Student> students) {
        this.students = students;
    }

    // Метод интерфейса iGetModel для получения списка студентов
    // Возвращает новый ArrayList, содержащий все значения из HashMap
    public List<Student> getStudents() {
        return new ArrayList<>(students.values());
    }

    // Метод для удаления студента по идентификатору
    // Возвращает true, если студент успешно удален, иначе - false
    public boolean deleteStudent(Integer studentId) {
        // Проверка наличия студента с заданным идентификатором
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            return true; // Успешное удаление студента
        } else {
            return false; // Студент с указанным идентификатором не найден
        }
    }
}
