package notknow.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

public class MyResources extends ResourceBundle {

    public Object handleGetObject(String key) {
        if (key.equals("okKey")) return "Ok";
        if (key.equals("cancelKey")) return "Cancel";
        return null;
    }
    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }

    protected Set<String> handleKeySet() {
        return new HashSet<String>(Arrays.asList("okKey", "cancelKey"));
    }
    
    public static void main(String[] args) {
    	MyResources mr = new MyResources();
    	mr.handleKeySet();
    	Enumeration<String> keys = mr.getKeys();
    	while(keys.hasMoreElements()){
    		System.out.println(keys.nextElement());
    	}
    	System.out.println(mr.handleGetObject("okKey"));
	}

}
