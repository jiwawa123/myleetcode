package com.ji.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/29/18:28
 */
public class TestSocket {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket socketClient = serverSocket.accept();
            new Thread(() -> {
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                PrintWriter printWriter = null;
                try {
                    printWriter = new PrintWriter(socketClient.getOutputStream(), true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String request = null;
                int i = 0;
                while (true) {
                    try {
                        if (!((request = reader.readLine()) != null)) break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(request);
                    printWriter.println("test" + (i++) + "" + socketClient.getPort());
                }
            }).start();
        }
    }
}
