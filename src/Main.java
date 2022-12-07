import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean isExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!isExists || isDirectory) {
                System.out.println("Файл не существует или указаный путь является путем к папке, а не к файлу");
                continue;
            }
            if (isExists) {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
            }
        }
    }
}
