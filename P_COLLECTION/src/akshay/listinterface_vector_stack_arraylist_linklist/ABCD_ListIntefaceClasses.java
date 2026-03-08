package akshay.listinterface_vector_stack_arraylist_linklist;

public class ABCD_ListIntefaceClasses {
}
/*
 * As we know ,in list interface we have 4 implemented classes which are 
 1)Vector.
 2)Stack.
 3)ArrayList.
 4)LinkList.
 
 1)Vector<E>:-
 ================
 * it is the predefined legacy class available in JDK 1.0v.
 * it is the implemented class from list interface.
 * it can accept duplicates, null,homogeneous,and heterogeneous elements.
 * it stored the element base of index position.
 * internally it is use dynamic arrays data structure.
 * initial default capacity is 10.
 * next capacity depend upon formula.
 * each and every method are synchronize so performance wise its slow as 
   compaire ArrayList class.
 * it is similar to array list, only difference is vector method are synchronize 
   but in ArraysList method are not synchronize.
 * it is use when tread safety is required.
 
 Constructor of vector class:-
 ===============================
 * 1)Vector v1 = new Vector():- default constructor, default capacity is 10.
 * 2)Vector v2 = new Vector(int initial Capacity):- user specified capacity.
 * 3)Vector v3 = new Vector(int capacity, int capacity increment):-new Vector(100,5).
 * 4)Vector v4 = new Vector(Collection c):- we can achieve loose coupling.

 
 Method :-
 ============
  
 * Adding Elements :
  1) addElement() :-
  2) insertElemnt() :-
  
 * Get Elements :
  3) firstElement() :-
  4) lastElement() :-
  5) elementAt() :-
  
 * Remove Elements : 
  6) removeElement () :-
  7) removeElementAt () :-
  8) removeAllElements () :-
  
  * Size Method :
  9) capacity () :-
  10) setSize () :-
  11) trimToSize () :-
  
  Note :- we can use All collection, Collections, List method.
  
 =============================================================================================================================
 
2)Stack<E>:-
============
public class Stack<E> extends Vector<E>

* It is the predefined legacy class introduce from JDK 1.0v, 
  which is available in java.util package.
* It is a linear data structure which work on basis of LIFO(last in first out).
* It is stored element base on the INDEX position.
* It can accept duplicate,null homogeneous and heterogeneous elements.

Constructor :-
===============
* Stack stk = new Stack();


 
 Method of stack :- 
====================
1) push() :- it will insert the elements in the top of the stack just like addElement() method.

2) pop() :- will Retrieve and Delete the elements from top of the stack, 
           if the stack is empty,then it will throw the exception.

3) peek() :- will only retrieve the elements from the top of stack.

4) boolean empty() :- will verify whether the stack is empty or not.

5) int search(Object ob) :- will search elements from the stack and return the position (index number).

Note :- we can use All collection, Collections, List method, Vector class method.

=======================================================================================================================================


3) ArrayList<E> :-
==================
* It is the predefined class implemented from list interface.
* it is available in java.util package from JDK 1.2v.
* It can accept duplicate,null,homogeneous and heterogeneous elements.
* It stored the element base on the index position.
* Default capacity of ArrayList class 10.
* method are not synchronize no thread safety here.
* so performance wise is better than vector.
* It is mainly used to retrieve element when thread safety is not required.
* It is a same as like vector but here method is not synchronize.  

Constructor Of ArrayList :-
===========================
1) ArrayList a1 = new ArrayList();
            
        * with create a list by default capacity is 10. 

2) ArrayList a2 = new ArrayList(int capacity);
        
        * user specified capacity.
        
3) ArrayList a3 = new ArrayList(collection c);

        * copy the collection data into another.

Method Of ArrayList :-
======================
0) asList() :- It will create fix length arrays and return type is List interface.
			   Array class method
1) add() :-
2) addAll()
3) remove(int index)
4) removeAll()
5) get()
6) set()
7) size()
8) clear()
9) contains()
10) isEmpty()
11) indexOf()
12) lastIndexOf()
13) iterator()
14) listIterator()
15) forEach()
16) toArray()
17) sort()
18) replaceAll()
19) ensureCapacity()
20) trimToSize()   

Note :- we can use All collection, Collections method. 
        but not use vector class and stack class method.
==================================================================================================================================



3) LinkedList<E> class :-
========================

* It is an implemented class of List<E> interface and Deque<E> interface.
  available in java.util package from 1.2 v.
* It can accept duplicate, null,homogeneous, heterogeneous elements.
* It stored the elements base on the index position but,
  in non contiguous memory location.
* it is use single linked list, doubly linked list, circular liked list.
* it stored data in Node class format.
* Default capacity is 0, we stored element one new node.
* Each node is interlink with each other.
* Method are not synchronize.
* IT IS MAINLY USE TO PERFORM INSERTION AND DELETION IN THE MIDDLE OF THE LIST.  


* Constructor :-

1) LinkedList<E> l1 = new LinkedList<E>();
   default capacity is 0.
   
2) LinkedList<E> l1 = new LinkedList<E>(collection call);
   to provide loose coupling.   
 
* Method Of LinkedList :
 ========================
 
* 1) addFirst() :-
* 2) addLast() :-
* 3) getFirst() :-
* 4) getLast() :-
* 5) removeFist() :-
* 6) removeLast () :-
* 7) indexOf () :-
* 8) lastIndexOf () :-

Note :- we can use All collection, Collections, List method.
        But Not use vector and stack. 

 */
 