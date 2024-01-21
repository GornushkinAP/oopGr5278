package servises;

import java.util.List;

// Интерфейс для сервиса управления операциями с объектами типа T
public interface iPersonService<T> {

    // Метод для получения списка всех объектов типа T
    List<T> getAll();

    // Метод для создания нового объекта типа T с указанием имени и возраста
    void create(String name, int age);
}
