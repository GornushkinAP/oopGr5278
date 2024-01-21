package servises;

import java.util.ArrayList;
import java.util.List;
import domain.classes.Employee;
import domain.classes.PersonComparator;

// Сервис для управления операциями с объектами типа Employee
public class EmployeeService implements iPersonService<Employee> {

    // Счетчик сотрудников
    private int count;

    // Список сотрудников
    private List<Employee> employees;

    // Конструктор для создания объекта EmployeeService с инициализацией списка
    public EmployeeService() {
        employees = new ArrayList<>();
    }

    // Метод для получения списка всех сотрудников
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    // Метод для создания нового сотрудника с указанием имени, возраста и специализации
    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age, "technics"); // Создание объекта Employee
        count++;
        employees.add(emp); // Добавление сотрудника в список
    }

    // Метод для сортировки списка сотрудников по ФИО
    public void sortByFIO() {
        PersonComparator<Employee> emComp = new PersonComparator<>(); // Создание компаратора для сотрудников
        employees.sort(emComp); // Сортировка списка сотрудников
    }
}
