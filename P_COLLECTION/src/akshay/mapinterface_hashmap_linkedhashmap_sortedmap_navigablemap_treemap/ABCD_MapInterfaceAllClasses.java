package akshay.mapinterface_hashmap_linkedhashmap_sortedmap_navigablemap_treemap;

public class ABCD_MapInterfaceAllClasses {
	
	/*
	 3) Map<k,v> interface :-
	 ======================
	 * If you want to represent group of object in the form of key and value
	   then we will use Map interface. 
	 * It is a separate interface, It does not any concern with collection<E> interface.
	 * It is not support any method of collection interface.
	 * It is mainly use to work with group of object (key and value).
	 * Here key and value both are object.
	 * Map<E,v> does not accept duplicate key but value may be duplicates. 
	 
	 
	 Method Of Map<k,v>:-
	 ====================
	 
	 1) V put(Object key,Object value):-
	 		* It is use to insert key and value in map. 
	 		  it will return the value of old object key,
	 		  if key is already available(Duplicate key),
	 		  If key is not available(new key) then it will return null.
	 
	 2) default v putIfAbsent(Object key,Object value):-
	        * it will insert an entry if and only if, key is not available,
	          if the key is already available then it will not insert the 
	          entry to the map collection.
	        
	 3) v get(Object key):- 
	        * it will return corresponding key value, 
	          if the key is not available then it will return null.
	         
	 4) Object getOrDefault(Object key, Object default value):-
	        * To avoid null value this method has been introduce 
	          from JDK 1.8v, here we can pass some default null value.
	         
	 5) boolean containsKey(Object key):- To search a particular key.
	 
	 6) boolean containsValue(Object value):- To search a particular value.
	 
	 7) int size():- To count the number of entries.
	 
	 8) remove(Object key):- One complete entry will be remove.
	 
	 9) void clear():- use to clear the map.
	 
	 10) isEmpty():- to use check map is empty or not.
	 
	 11) void putAll(map m):- Merging of two map collection.
	 
	 12) forEach(BiConsumer<T,U> cons):-
	       * use to fetch key and value from the map. 
	         it is added inside map<k,v> interface from JDK 1.8v.
	        
	                
	 13) computeIfAbsent(key,function<T,R> mapper):-
	       * it compute a value for a given key if it not already present in the map, 
	         and then insert that computed value into the map.
	       
	                     
	 14) V computeIfPresent(key,BiFunction<T,U,R> mapper):-
	       * It updates the value for a key only if that key is already available in the map.
	        
	                        
	                        
	 Method of map interface to convert the map into collection:
	 ===========================================================
	 * we have map interface method through which we can convert map interface into 
	   collection interface which is knows as collection view method.
	 
	 1) set<Object> keySet():- It will retrieve all the keys.
	 
	 2) Collection values():- It will retrieve all the value.
	 
	 3) Set<Map.Entry<k,v>> entrySet():- It will retrieve key and value both in a single object.
	    a)getKey()
	    b)getValue()     
	    
	 
	1) HashMap<k,v>[Un-Sorted, UnOrder, No Duplicate key] 
	======================================================
	* It is an implemented class from map<k,v> interface available from JDK 1.2v
	* It does not accept duplicate key but can accept duplicate value.
	* It can accept homogeneous and heterogeneous value. 
	* It can accept only null key and multiple null value.
	* It is an un-sorted and un-order map.
	* It is use hash table data structure.
	* The entry will be inserted based on the hashCode() of the key object.
	* Default capacity is 16 so, initially 16 buckets will be created.
	* Method are not synchronize.
	* Iterator is fail fast iterator.
	* It is mainly use to fetch the entry from the map collection.
	* It provide constant time performance for insertion,deletion and searching operation.
	 
	Constructor:-
	=============
	1) HashMap hm1 = new HashMap():-default capacity is 16.
	 
	2) HashMap hm2 = new HashMap(int initial capacity):-
	       will create the HashMap object with user specified capacity.
	   
	3) HashMap hm3 = new HashMap(int initial capacity, float loadFactor):-
	       we can specified our initial capacity and loadFactor(by default is 0.75).
	       
	4) HashMap hm4 = new HashMap(Map<k,v>m):-
	       InterConversion of Map Collection.
	       
	       
======================================================================================================
	       
	       
	                                   
	                 
	 */
	
	
}
