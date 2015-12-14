package test;

import org.apache.commons.beanutils.BeanUtils;

import net.sf.json.JSONObject;


public class JDKTest {
	public static void main(String[] args) {
		ClassLoader cloader = JDKTest.class.getClassLoader();
		while(cloader != null){
			System.out.println(cloader.toString());
			cloader = cloader.getParent();
		}
	}
}
