package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * UDP通信
 * 客户端
 * @author lianggaoquan
 *
 */
public class MyClient {

	public static void main(String[] args) throws IOException{
		// 1.创建客户端 + 端口
		DatagramSocket client = new DatagramSocket(8089);
		
		//2.准备数据
		String msg = "Hello,world";
		byte[] data = msg.getBytes();
		
		// 3.打包(发送地点及端口)
		DatagramPacket packet = 
								new DatagramPacket(data,data.length,
								new InetSocketAddress("localhost",8888));
		
		// 4.发送
		client.send(packet);
		
		// 5.释放资源
		client.close();
		
	}

}
