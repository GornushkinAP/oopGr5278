import java.util.Iterator;
import java.util.List;

// Класс, представляющий группу студентов и реализующий интерфейсы Iterable и Comparable
public class StudentGroup<T extends Comparable<T>,V>  implements Iterable<Student<T,V>> {

    // Список студентов в группе
    private List<Student<T,V>> list;

    // Идентификатор группы
    private V groupId;

    // Название группы
    private T groupName;

    // Конструктор для создания объекта StudentGroup с указанием списка студентов, идентификатора и названия группы
    public StudentGroup(List<Student<T,V>> list, V groupId, T groupName) {
        this.list = list;
        this.groupId = groupId;
        this.groupName = groupName;
    }

    // Геттер для получения списка студентов
    public List<Student<T,V>> getList() {
        return list;
    }

    // Сеттер для установки списка студентов
    public void setList(List<Student<T,V>> list) {
        this.list = list;
    }

    // Геттер для получения группы студентов
    public List<Student<T,V>> getGroup() {
        return list;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "StudentGroup: " + groupName + "\n" + " list: " + "\n" + list + "\n" + " groupId = " + groupId + " } " + "\n";
    }

    // Переопределенный метод iterator для реализации итерирования по студентам в группе
    @Override
    public Iterator<Student<T,V>> iterator() {
        return new StudentIterator<T,V>(list);
    }

    // Геттер для получения идентификатора группы
    public V getGroupId() {
        return groupId;
    }

    // Сеттер для установки идентификатора группы
    public void setGroupId(V groupId) {
        this.groupId = groupId;
    }

    // Геттер для получения названия группы
    public T getGroupName() {
        return groupName;
    }

    // Сеттер для установки названия группы
    public void setGroupName(T groupName) {
        this.groupName = groupName;
    }

}
