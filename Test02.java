import java.net.InetSocketAddress;

/**
 * InetSocketAddress
 * @author lianggaoquan
 *
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetSocketAddress addr = new InetSocketAddress("192.168.242.141",9999);
		
		System.out.println(addr.getHostName());
		System.out.println(addr.getPort());
	}

}
