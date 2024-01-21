package servises;

import java.util.ArrayList;
import java.util.List;

import domain.classes.PersonComparator;
import domain.classes.Student;

// Сервис для управления операциями с объектами типа Student
public class StudentService implements iPersonService<Student> {

    // Счетчик студентов
    private int count;

    // Список студентов
    private List<Student> students;

    // Конструктор для создания объекта StudentService с инициализацией списка
    public StudentService() {
        students = new ArrayList<>();
    }

    // Метод для получения списка всех студентов
    @Override
    public List<Student> getAll() {
        return students;
    }

    // Метод для создания нового студента с указанием имени и возраста
    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age); // Создание объекта Student
        count++;
        students.add(stud); // Добавление студента в список
    }

    // Метод для сортировки списка студентов по ФИО
    public void sortByFIO() {
        PersonComparator<Student> studComp = new PersonComparator<>(); // Создание компаратора для студентов
        students.sort(studComp); // Сортировка списка студентов
    }
}
