import java.io.IOException;
import java.util.ArrayList;

/**
 *  * Created by Gokhan Arik on 10/8/15.
 *   */
public class Client {
    private static final String hostName = "";
    private static final int portNumber = 4444;

    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<MultiClientThread> clients = new ArrayList<>();

        for (int i=0; i < 3; i++){
            MultiClientThread client = new MultiClientThread(hostName, portNumber);
            client.start();
            clients.add(client);
            Thread.sleep(4000);
        }
    }
}

