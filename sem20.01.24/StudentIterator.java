import java.util.Iterator;
import java.util.List;

// Итератор для класса Student, реализующий интерфейс Iterator
public class StudentIterator<T extends Comparable<T>,V> implements Iterator<Student<T,V>> {

    // Счетчик текущего индекса в списке студентов
    private int count;

    // Список студентов, по которому происходит итерирование
    private List<Student<T,V>> list;

    // Конструктор для создания объекта StudentIterator с указанием списка студентов
    public StudentIterator(List<Student<T,V>> list) {
        this.list = list;
        this.count = 0;
    }

    // Переопределенный метод hasNext для проверки наличия следующего элемента в списке
    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    // Переопределенный метод next для получения следующего студента из списка
    @Override
    public Student<T,V> next() {
        int index = count;  // Запоминаем текущий индекс
        count++;            // Увеличиваем счетчик для следующего вызова
        return list.get(index);  // Возвращаем студента по текущему индексу
    }

}
