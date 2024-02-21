import java.util.HashSet;
import java.util.Iterator;

public class Hashing_operation_{
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {

    //Creating
    HashSet<Integer> set = new HashSet<>();

    //Insert 
    set.add(1);  // list.add(el)
    set.add(2);
    set.add(3);
    set.add(1);  // list.add(el)

    //Size
    System.out.println("size of set is: " + set.size());

    //Print all elements
    System.out.println(set);


    //Search - Contains
    if(set.contains(1)){
      System.out.println("Set contains 1");
    }
    if(!set.contains(6)){
      System.out.println("does not conatain");
    }

    //Delete
    set.remove(1);
    if(!set.contains(1)){
      System.out.println("We deleted 1");
    }

    //Iterator
    Iterator it = set.iterator();
    //hasnext; next;
    while(it.hasNext()){
      System.out.println(it.next());
    }
    
  }
}