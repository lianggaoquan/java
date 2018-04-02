package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",8888);

        String msg = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message here (in lower case) :");

        msg = scan.nextLine();

        /**
         * 接收服务器信息
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        bw.write(msg);
        bw.newLine();
        bw.flush();

        String upperMsg = br.readLine();
        System.out.println("=================Receive message from server===================");

        System.out.println(upperMsg);

        bw.close();
        br.close();
    }
}
