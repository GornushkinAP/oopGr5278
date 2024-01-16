package domain.classes;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Класс, представляющий поток студентов и реализующий интерфейс Iterable
public class StudentStream implements Iterable<StudentGroup> {

    // Идентификатор потока студентов
    private int streamId;

    // Список групп студентов в данном потоке
    private List<StudentGroup> groups;

    // Конструктор для создания объекта StudentStream с указанием идентификатора и списка групп
    public StudentStream(int streamId, List<StudentGroup> groups) {
        this.streamId = streamId;
        this.groups = groups;
    }

    // Геттер для получения идентификатора потока
    public int getStreamId() {
        return streamId;
    }

    // Сеттер для установки идентификатора потока
    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    // Геттер для получения списка групп
    public List<StudentGroup> getGroups() {
        return groups;
    }

    // Сеттер для установки списка групп
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "StudentStream { " + "Groups = " + groups + ", Stream Id = " + streamId + ", Groups Amount = " + groups.size() + " }" + "\n";
    }

    // Переопределенный метод iterator для реализации итерирования по группам студентов
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupsIterator(groups);
    }

    // Метод для сортировки групп в потоке
    public void sortGroups() {
        Collections.sort(groups);
    }
}
