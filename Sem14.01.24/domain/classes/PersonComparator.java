package domain.classes;

import java.util.Comparator;

// Компаратор для сравнения объектов типа Person по имени
public class PersonComparator<T extends Person> implements Comparator<T> {

    // Переопределенный метод compare для сравнения двух объектов типа Person
    @Override
    public int compare(T o1, T o2) {

        // Сравниваем имена объектов типа Person
        int res = o1.getName().compareTo(o2.getName());

        // Если имена равны, возвращаем 0
        if (res == 0) {
            return 0;
        } else {
            // Возвращаем результат сравнения имен
            return res;
        }
    }
}
