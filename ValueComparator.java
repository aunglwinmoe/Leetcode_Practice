package algorithm;

import java.util.Comparator;
import java.util.HashMap;

public class ValueComparator implements Comparator<Integer>{
	 
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
	public ValueComparator(HashMap<Integer, Integer> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(Integer s1, Integer s2) {
		if(map.get(s1) >= map.get(s2)){
			return -1;
		}else{
			return 1;
		}	
	}
}