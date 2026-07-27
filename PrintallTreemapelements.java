package SDETInterview;

import java.util.Map;
import java.util.TreeMap;

public class PrintallTreemapelements {
  //Program to Print all Treemap elements?
	public static void main(String[] args) {
		 TreeMap<Integer, String> tm = new TreeMap<>();
		 tm.put(3, "C");
		 tm.put(1, "A");
		 tm.put(2, "B");
		 System.out.println("TreeMap elements: "+ tm);
	 for (Map.Entry<Integer, String> entry : tm.entrySet()) {
		 
			 System.out.println(entry.getKey() + "->"+entry.getValue());
			 
		 }
	}
	
}
