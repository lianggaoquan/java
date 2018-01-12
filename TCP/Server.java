package TCP_Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socketͨ��
 * ����TCPЭ��
 * ������
 * @author lianggaoquan
 *
 */
public class Server {

	public static void main(String[] args) throws IOException {
		
		// 1.���������� + �˿�
		ServerSocket server = new ServerSocket(8888);
		
		// 2.���տͻ�������
		Socket socket = server.accept();
		System.out.println("���տͻ�������");
		
		// 3.��������
		String msg = "���Է���������Ϣ";
		/*
		BufferedWriter bw = new BufferedWriter(
							new OutputStreamWriter(
								socket.getOutputStream()));
		bw.write(msg);
		bw.newLine();
		bw.flush();
		*/
		
		//ʹ�� DataOutputStream
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		
		
	}

}
