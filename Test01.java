import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress:��װIP��ַ��DNS,���������˿�
 * InetSocketAddress:�����˿�
 * @author lianggaoquan
 *
 */
public class Test01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());	//����IP
		System.out.println(addr.getHostName());		//���ؼ������
		
		System.out.println("==============");
		addr = InetAddress.getByName("cn.bing.com");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
	}

}
