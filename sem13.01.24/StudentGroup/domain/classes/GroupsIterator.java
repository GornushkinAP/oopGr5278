package domain.classes;

import java.util.Iterator;
import java.util.List;

// Итератор для класса StudentGroup, реализующий интерфейс Iterator
public class GroupsIterator implements Iterator<StudentGroup> {

    // Счетчик текущего индекса в списке групп
    private int count;

    // Список групп, по которому происходит итерирование
    private List<StudentGroup> groups;

    // Конструктор для создания объекта GroupsIterator с указанием списка групп
    public GroupsIterator(List<StudentGroup> groups) {
        this.groups = groups;
        this.count = 0; // Инициализация счетчика
    }

    // Переопределенный метод hasNext для проверки наличия следующего элемента в списке
    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    // Переопределенный метод next для получения следующей группы из списка
    @Override
    public StudentGroup next() {
        // Проверка наличия следующей группы
        if (!hasNext()) {
            return null;
        }

        // Возвращаем группу по текущему индексу и увеличиваем счетчик для следующего вызова
        return groups.get(count++);
    }
}
