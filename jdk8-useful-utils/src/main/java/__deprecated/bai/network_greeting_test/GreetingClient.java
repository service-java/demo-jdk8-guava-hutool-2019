package __deprecated.bai.network_greeting_test;

/**
 * Description:
 * User: luo0412 1095847440@qq.com
 * Date: 2018-03-09
 * Time: 10:56
 */

import java.net.*;
import java.io.*;

public class GreetingClient {

    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("connecting " + serverName + " port" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("remote host " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("response " + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}