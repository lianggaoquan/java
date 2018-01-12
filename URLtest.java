import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class URLtest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("https://tensorflow.google.cn/api_docs/python/");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream("tensorflow.html"),"utf-8"));
		String msg = null;
		
		while((msg=br.readLine())!=null){
			bw.append(msg);
			bw.newLine();
		}
		bw.flush();
		
		bw.close();
		br.close();
	}

}
