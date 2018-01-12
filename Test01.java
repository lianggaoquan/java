import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress:封装IP地址和DNS,但不包含端口
 * InetSocketAddress:包含端口
 * @author lianggaoquan
 *
 */
public class Test01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());	//返回IP
		System.out.println(addr.getHostName());		//返回计算机名
		
		System.out.println("==============");
		addr = InetAddress.getByName("cn.bing.com");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
	}

}
