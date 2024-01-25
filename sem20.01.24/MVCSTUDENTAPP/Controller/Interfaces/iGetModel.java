package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;


// Интерфейс, предоставляющий методы для получения данных модели
public interface iGetModel {
    // Метод для получения списка студентов из модели
    // Возвращаемый тип: List<Student> - список объектов Student
    public List<Student> getStudents();
    boolean deleteStudent(Integer studentId);
   
}
