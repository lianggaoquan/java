package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception{

	// write your code
        ServerSocket server = new ServerSocket(8888);

        Socket client = server.accept();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String primaryMsg = br.readLine();

        String upper = primaryMsg.toUpperCase();

        bw.write(upper);
        bw.newLine();
        bw.flush();

        bw.close();
        br.close();
    }


}
