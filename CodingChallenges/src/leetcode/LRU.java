package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LRU {
	public static void main(String args[]) {
		LRUCache lru = new LRUCache(2);
		lru.put(1, 10);
		lru.get(1);
		lru.put(2, 20);
		lru.get(1);
		lru.put(3, 30);
		lru.get(1);
		lru.put(4, 40);
		System.out.println(lru.get(1));
		
	}
}

class LRUCache {

    Map<Integer, Integer> map;
    int capacity;
    public LRUCache(int capacity) {
        map = new LinkedHashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
    	//System.out.println("map size:"+map.size());
        if( map.containsKey(key) ) {
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            return val;
        } else return -1;
    }
    
    public void put(int key, int value) {
        
            if (map.size() < capacity ) {
                map.put (key, value);
            } else {
                removeFirstElement();
                map.put(key, value);
            }
        
    }
    
    public void removeFirstElement() {
        if (map != null && map.size() > 0 ) {
            for(Map.Entry<Integer, Integer> m: map.entrySet()) {
			    map.remove(m.getKey());
			    break;
		    }
        }
    }
}
