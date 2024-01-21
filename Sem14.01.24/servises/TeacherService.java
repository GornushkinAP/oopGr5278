package servises;

import java.util.ArrayList;
import java.util.List;

import domain.classes.PersonComparator;
import domain.classes.Teacher;

// Сервис для управления операциями с объектами типа Teacher
public class TeacherService implements iPersonService<Teacher> {

    // Счетчик учителей
    private int counter;

    // Список учителей
    private List<Teacher> teachers;

    // Конструктор для создания объекта TeacherService с инициализацией списка
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    // Метод для получения списка всех учителей
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    // Метод для создания нового учителя с указанием имени и возраста
    @Override
    public void create(String name, int age) {
        Teacher teachs = new Teacher(name, age, name); // Создание объекта Teacher
        teachers.add(teachs); // Добавление учителя в список
    }

    // Метод для сортировки списка учителей по ФИО
    public void sortByFIO() {
        PersonComparator<Teacher> teachComp = new PersonComparator<>(); // Создание компаратора для учителей
        teachers.sort(teachComp); // Сортировка списка учителей

        // Вывод отсортированного списка учителей по ФИО
        System.out.println("Отсортированный список учителей по ФИО:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    // Дополнительные методы для сортировки по возрасту могут быть добавлены и аннотированы
    // в комментарии, как вариант к использованию в будущем.

    // public void sortByAge() {
    //     PersonComparator<Teacher> teachAge = new PersonComparator<>();
    //     teachers.sort(teachAge);

    //     System.out.println("Отсортированный список учителей по возрасту:");
    //     for (Teacher teacher : teachers) {
    //         System.out.println(teacher);
    //     }
    // }
}
