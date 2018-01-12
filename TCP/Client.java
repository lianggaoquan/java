package TCP_Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Socketͨ��
 * ����TCPЭ��
 * �ͻ���		����ָ��������+�˿�,��ʱ��������
 * @author lianggaoquan
 *
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// 1.ָ��������+�˿�,��ʱ��������
		Socket client = new Socket("localhost",8888);
		
		// 2.�������� 
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
