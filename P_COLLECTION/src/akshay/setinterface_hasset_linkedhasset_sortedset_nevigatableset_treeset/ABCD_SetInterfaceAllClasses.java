package akshay.setinterface_hasset_linkedhasset_sortedset_nevigatableset_treeset;

public class ABCD_SetInterfaceAllClasses {
	
	/*
	 Set<E>interface:-[UNORDER,UNSORTED,NO DUPLICATES]
	 ===============
	 * Set is implemented Interface from collection interface.
	 * set interface available in java.util package from JDK 1.2v.
	 * set interface does not follow indexing technique, 
	   actually it is use "hashing technique".
	 * set interface never accept duplicate elements.
	 * So ListItorator interface does will not work with set<E> interface.
	 * set<E> are use all the method are collection<E> interface, 
	   few more method are added from JDK 9v.
	 * Set Interface is non synchronize.
	 * set interface is not follow sorting order.
	   
	                      set(I)1.2v.
	 HashSet<E>(c)1.2v                      SortedSet(i)1.2v 
	 LinkedHashSet<E>(c)1.4v                NavigableSet(i)1.6v
	                                        TreeSet(c)1.2v
	                                        
	                                        
	 
	 1) HashSet <E>:-
	 ================
	 * It is implemented class from set interface available in JDK 1.2v.
	 * It does not accept duplicates multiple null values.
	 * It  can accept homogeneous and heterogeneous value and one null value.
	 * It is un_order and un_sorted set.
	 * It is use hash table data structure.
	 * The elements are inserted base on the hash code.
	 * Default capacity is 16.
	 * Methods are not synchronize so thread are not secure.
	 * It is mainly used for to search elements of large amount of data. 
	 
	  
	 Constructor:-
	 =============
	 1) HashSet<E> hs = new HashSet():-
	 * It will create the HashSet object default capacity is 16. 
	 
	 2) HashSet<E> hs = new HashSet(Int initial capacity):-
	 * Use specified capacity.
	 
	 3) HashSet<E> hs = new HashSet(Int initial capacity,Float loadFactor):-
	 * We can specified our own initial capacity and load factor.
	 
	 4)  HashSet<E> hs = new HashSet(Collection c):-
	 * Interconversion of collection
	 */
	
	
}
