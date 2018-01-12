package TCP_Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket通信
 * 基于TCP协议
 * 服务器
 * @author lianggaoquan
 *
 */
public class Server {

	public static void main(String[] args) throws IOException {
		
		// 1.创建服务器 + 端口
		ServerSocket server = new ServerSocket(8888);
		
		// 2.接收客户端连接
		Socket socket = server.accept();
		System.out.println("接收客户端连接");
		
		// 3.发送数据
		String msg = "来自服务器的信息";
		/*
		BufferedWriter bw = new BufferedWriter(
							new OutputStreamWriter(
								socket.getOutputStream()));
		bw.write(msg);
		bw.newLine();
		bw.flush();
		*/
		
		//使用 DataOutputStream
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		
		
	}

}
