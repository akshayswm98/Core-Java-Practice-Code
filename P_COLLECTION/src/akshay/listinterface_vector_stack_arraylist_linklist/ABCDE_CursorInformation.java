package akshay.listinterface_vector_stack_arraylist_linklist;

public class ABCDE_CursorInformation {}
/*
 * Generally cursor we can use for fetch the elements one by one 
   forward and backward direction. 
   
 In java having  4 cursor.
 ==========================
  1) Enumeration<E> interface.
  2) Iterator<E> interface.
  3) ListIterator<E> interface.
  4) Spliterator Interface.
  
  
 1) Enumeration<E> interface:-
 ============================
 
 * It is the predefined legacy interface available in java.util package from JDK 1.0v.
 * It is a cursor throw which we can read collection object one by one.
 * It works with only legacy classes.
 * we can create Enumeration by using elements() method.
 * Enumeration e = listOfCity.elements();
 
 
 Method Of Enumeration:-
 ======================
 1) hasMoreElements():-
 It will return boolean value,if the collection object is available in the current position.
 
 2) nextElements():-
 It will return collection object so return type is object(E) and move the cursor to the next line.
 
 **********************************************************************************************************************
  
  
 2) Iterator<E>Interface:-
 =======================
 * It is the predefined interface available in java.util package from JDK 1.2v.
 * It is use to fetch the elements from the collection in forward direction only.
 
 ex:- Iterator i = nameOfCity.Iterator();
 
 Method Of Iterator:-
 ======================
 
 1) hasNext():-
 * it will verify the elements is available or not if available return boolean value.
 
 1) next():-
 * it will return the collection object and move the cursor object.
 
 *********************************************************************************************************************
 
 
 3) ListEtorator<E> Interface:-
 ============================
 * It is a predefined interface available in java.util package and it is the sub interface of iterator 
  available from JDK 1.2v.
 * It is used to retrieve the collection object in the both direction,
  i.e Forward direction and backward direction.
 
 ListEtorator lit = listOfCity.listiterator();
 
 
 Method of ListItorator:-
 =========================
 1) hasNext()
 2) next()
 3) hasPrevious():-it will verify the element available in previous position or not,if not available then,
                   will return false.
 
 4) previous():-It will return the previous position.
 
 
 
  
 ***************************************************************************************************************************
 
  
 4) Spitarator interface():-
 =========================
 * it is the predefined interface available in java.util package from JDK 1.8v
 * It is the cursor through we can fetch the elements from the collection.
 * It is the combination of hasNext() and next() method.
 
 ****************************************************************************************************************************
 */
