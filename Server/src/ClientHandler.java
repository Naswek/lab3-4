import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClientHandler implements Runnable {

    private final Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String line;

    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;

         this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         this.out = new PrintWriter(socket.getOutputStream(), true);
    }

    @Override
    public void run() {
        try {
            while ((line = in.readLine()) != null) {
                if (line.equals("exit")) {
                    break;
                }
                String specificLine = Files.readAllLines(Paths.get("my_text.txt")).get(Integer.parseInt(line));
                out.println(specificLine);
                System.out.println(specificLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
