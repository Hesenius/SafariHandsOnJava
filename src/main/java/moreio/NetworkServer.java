package moreio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class NetworkServer {
  public static void main(String[] args) {
    try (ServerSocket ss = new ServerSocket(9876);) {
      Socket s = ss.accept();
      BufferedReader br = new BufferedReader(
          new InputStreamReader(
              s.getInputStream(), Charset.forName("UTF-8")));
      String message = br.readLine();
      String response = "You said " + message + ", gosh, that's fascinating";
      PrintWriter output = new PrintWriter(
          new OutputStreamWriter(
              s.getOutputStream(),
              Charset.forName("UTF-8")));
      output.println(response);
      output.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
