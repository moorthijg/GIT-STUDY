package Interview_Questions;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps_10 {
	
	public static void main(String args[]) {
		
		Map map = new HashMap();
		
		map.put(1, "Moorthi");
		map.put(2, "jaganathan");
		map.put(3, "Gowri");
		map.put(4, "manisha");
		
		// printing the map as a array like output
		System.out.println(map);
		
		//converting the map  into set
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			  //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)it.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
		}
	}

}
