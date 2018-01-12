package TCP_Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Socket通信
 * 基于TCP协议
 * 客户端		必须指定服务器+端口,此时就在连接
 * @author lianggaoquan
 *
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// 1.指定服务器+端口,此时就在连接
		Socket client = new Socket("localhost",8888);
		
		// 2.接收数据 
		/*
		BufferedReader br = new BufferedReader(
							new InputStreamReader(
								client.getInputStream()));
		
		String response = br.readLine();
		System.out.println(response);
		*/
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String response = dis.readUTF();
		System.out.println(response);
	}

}
