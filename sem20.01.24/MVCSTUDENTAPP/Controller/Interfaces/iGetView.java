package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

// Интерфейс, предоставляющий методы для взаимодействия с пользовательским интерфейсом (View)
public interface iGetView {

     // Метод для вывода информации о всех студентах
     // Принимает список студентов в качестве параметра
     public void printAllStudents(List<Student> students);
 
     // Метод для запроса ввода пользователя с указанным сообщением
     // Принимает строку-сообщение в качестве параметра
     // Возвращает введенную пользователем строку
     String prompt(String msg);
 }
