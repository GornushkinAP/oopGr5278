package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

// Класс, реализующий модель приложения
public class ModelClass implements iGetModel {

    // Список студентов
    private List<Student> students;

    // Конструктор класса, принимающий список студентов
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    // Метод интерфейса iGetModel для получения списка студентов
    public List<Student> getStudents() {
        return students;
    }

    // Метод для удаления студента по идентификатору
    // Возвращает true, если студент успешно удален, иначе - false
    public boolean deleteStudent(Integer studentId) {
        // Проверка наличия студента с заданным идентификатором
        if (students.contains(studentId)) {
            students.remove(studentId);
            return true; // Успешное удаление студента
        } else {
            return false; // Студент с указанным идентификатором не найден
        }
    }
}
