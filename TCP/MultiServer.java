package TCP_Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socketͨ��
 * ����TCPЭ��
 * ������
 * ���ն���ͻ���
 * @author lianggaoquan
 *
 */
public class MultiServer {

	public static void main(String[] args) throws IOException {
		
		// 1.���������� + �˿�
		ServerSocket server = new ServerSocket(8888);
		
		// 2.���տͻ�������
		while (true) {	//һ��accept����һ���ͻ���
			Socket socket = server.accept();
			System.out.println("���տͻ�������");

			// 3.��������
			String msg = "���Է���������Ϣ";

			// ʹ�� DataOutputStream
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
		}

	}

}
