import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesRead {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\DELL\\Desktop\\hhhhh\\StockMiddleware\\src\\details.properties");
prop.load(fin);
		/*
		 * prop.put("username", "JANE"); prop.put("age", "22");
		 * System.out.println("username: "+prop.getProperty("username"));
		 * System.out.println("age: "+prop.getProperty("age"));
		 */
		/*
		 * prop.setProperty("1", "One"); prop.setProperty("2", "Two");
		 * prop.setProperty("3", "Three");
		 */
//Set<String> keys = prop.stringPropertyNames();
//for (String key : keys) {
//  System.out.println(key + " : " + prop.getProperty(key));
//}
Set set=prop.entrySet();
for(Object entry:set) {
	System.out.println(entry);
}

	}
}
