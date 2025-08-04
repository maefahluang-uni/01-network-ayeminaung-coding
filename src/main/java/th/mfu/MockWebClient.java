package th.mfu;

import java.io.*;
import java.net.*;

// call mockup server at port 8080
public class MockWebClient {
    public static void main(String[] args) {

        // TODO: Create a socket to connect to the web server on port 8080
        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("Connected to Mock Web Server on port 8080...");
            String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            out.println(request);

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                System.out.println("From server response : " + userInput); 
            }

            socket.close();
            System.out.println("Connection closed.");

        } catch (IOException e) {
            System.err.println("Could not connect to server: " + e.getMessage());
            return;
        }

        // :TODO Create input and output streams for the socket

        // TODO: send an HTTP GET request to the web server

        // Read the response from the web server and print out to console

        // Close the socket

    }

}
