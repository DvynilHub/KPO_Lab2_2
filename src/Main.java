import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        replaceSelected();
    }
    public static void replaceSelected() throws IOException {

            String fileName = "C:\\Users\\User\\Desktop\\123.txt";
            String search = "public";
            String replace = "private";
            Charset charset = StandardCharsets.UTF_8;
            Path path = Paths.get(fileName);
        try {
            Files.write(path,
                    new String(Files.readAllBytes(path), charset).replace(search, replace)
                            .getBytes(charset));
            System.out.println("Замена произведена");
        } catch (NoSuchFileException e){
            System.out.println("Файл не найден");

        }
    }
}
