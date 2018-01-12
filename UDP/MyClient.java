package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * UDPͨ��
 * �ͻ���
 * @author lianggaoquan
 *
 */
public class MyClient {

	public static void main(String[] args) throws IOException{
		// 1.�����ͻ��� + �˿�
		DatagramSocket client = new DatagramSocket(8089);
		
		//2.׼������
		String msg = "Hello,world";
		byte[] data = msg.getBytes();
		
		// 3.���(���͵ص㼰�˿�)
		DatagramPacket packet = 
								new DatagramPacket(data,data.length,
								new InetSocketAddress("localhost",8888));
		
		// 4.����
		client.send(packet);
		
		// 5.�ͷ���Դ
		client.close();
		
	}

}
