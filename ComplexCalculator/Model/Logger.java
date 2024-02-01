package Model;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Класс Logger предназначен для записи логов в файл
public class Logger {
    // Путь к файлу логов
    private static final String LOG_FILE_PATH = "calcLog.txt";

    // Метод для записи сообщения в лог-файл
    public static void log(String message){
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE_PATH, true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключения при возникновении ошибок ввода-вывода
        }
    }
}
