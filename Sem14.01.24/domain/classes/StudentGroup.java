package domain.classes;

import java.util.Iterator;
import java.util.List;

// Класс, представляющий группу студентов и реализующий интерфейсы Iterable и Comparable
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    // Список студентов в группе
    private List<Student> list;

    // Идентификатор группы
    private int groupId;

    // Название группы
    private String groupName;

    // Конструктор для создания объекта StudentGroup с указанием списка студентов, идентификатора и названия группы
    public StudentGroup(List<Student> list, int groupId, String groupName) {
        this.list = list;
        this.groupId = groupId;
        this.groupName = groupName;
    }

    // Геттер для получения списка студентов
    public List<Student> getList() {
        return list;
    }

    // Сеттер для установки списка студентов
    public void setList(List<Student> list) {
        this.list = list;
    }

    // Геттер для получения группы студентов
    public List<Student> getGroup() {
        return list;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "StudentGroup: " + groupName + "\n" + " list: " + "\n" + list + "\n" + " groupId = " + groupId + " } " + "\n";
    }

    // Переопределенный метод iterator для реализации итерирования по студентам в группе
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }

    // Геттер для получения идентификатора группы
    public int getGroupId() {
        return groupId;
    }

    // Сеттер для установки идентификатора группы
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    // Геттер для получения названия группы
    public String getGroupName() {
        return groupName;
    }

    // Сеттер для установки названия группы
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    // Переопределенный метод compareTo для сравнения текущей группы с другой группой по размеру списка студентов и идентификатору группы
    @Override
    public int compareTo(StudentGroup v) {
        // Сравнение по размеру списка студентов (по убыванию)
        if (v.getList().size() > list.size()) {
            return -1;
        }

        if (v.getList().size() < list.size()) {
            return 1;
        }

        // Если размеры равны, сравниваем по идентификатору группы (по убыванию)
        if (v.getGroupId() > groupId) {
            return -1;
        }

        if (v.getGroupId() < groupId) {
            return 1;
        }

        // Возвращаем 0, если группы равны по размеру и идентификатору
        return 0;
    }


}
