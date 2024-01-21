package controllers;

import java.util.ArrayList;

import domain.classes.Person;
import domain.classes.Teacher;
import domain.classes.Worker;

// Класс-контроллер для управления операциями с учетными данными
public class AccountController {

    // Обобщенный метод для выплаты зарплаты сотруднику
    public static <T extends Worker, V> void paySalary(T person, V salary) {
        // Выводим информацию о выплате зарплаты для указанного сотрудника
        System.out.println(person.getName() + " выплачена зарплата " + salary);
    }

    // Обобщенный метод для расчета среднего возраста для списка людей
    public static <T extends Person> void averageAge(ArrayList<T> peoples) {
        double sum = 0;

        // Суммируем возрасты всех людей в списке
        for (T people : peoples) {
            sum += people.getAge();
        }

        // Выводим средний возраст
        System.out.println("Средний возраст: " + sum / peoples.size());
    }
}
