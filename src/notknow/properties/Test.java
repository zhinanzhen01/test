package notknow.properties;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Test{
	public void test(){
		//Class.getResource(String path)
		//path不以’/'开头时，默认是从此类所在的包下取资源；
		//path  以’/'开头时，则是从ClassPath根下获取；
		System.out.println(getClass().getResource("test.properties"));
		System.out.println(getClass().getResource("/test.properties"));
		System.out.println("----------------------------------------");
		//Class.getClassLoader（）.getResource(String path)
		//path不能以’/'开头时；
		//path是从ClassPath根下获取；
		System.out.println(getClass().getClassLoader().getResource("test.properties"));
		System.out.println(getClass().getClassLoader().getResource("/test.properties"));
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.test();
		/*ResourceBundle bundle = ResourceBundle.getBundle("test");
		String tValue = bundle.getString("a").trim();
		System.out.println(tValue);*/
		/*InputStream resourceAsStream = Test.class.getClassLoader().getResourceAsStream("rokeTest/test.properties");
		InputStream resourceAsStream2 = Test.class.getResourceAsStream("/rokeTest/test.properties");
		Properties pro = new Properties();
		try {
			pro.load(resourceAsStream2);
			resourceAsStream.close();
			resourceAsStream2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String property = pro.getProperty("a");
		System.out.println(property);*/
	}
}

// German language
class MyResources_de extends MyResources {
    public Object handleGetObject(String key) {
        // don't need okKey, since parent level handles it.
        if (key.equals("cancelKey")) return "Abbrechen";
        return null;
    }
  protected Set<String> handleKeySet() {
        return new HashSet<String>(Arrays.asList("cancelKey"));
    }
}
