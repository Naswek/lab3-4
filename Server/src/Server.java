import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Server {
    public static void main(String[] args) {
        int port = 2525;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("" + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Подключился клиент: " + clientSocket.getInetAddress());

                System.out.println("Рабочая директория: " + Paths.get("").toAbsolutePath());
                System.out.println("Файл существует? " + Files.exists(Paths.get("my_text.txt")));

                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}