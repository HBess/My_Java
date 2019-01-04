/* 
 * Un itérateur est un objet qui a pour rôle de parcourir une collection.
 *    =========
 */

//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
// 
//public class Test {
// 
//  public static void main(String[] args) {
//    List l = new LinkedList();
//    l.add(12);
//    l.add("toto ! !");
//    l.add(12.20f);
//
//    for(int i = 0; i < l.size(); i++)
//      System.out.println("Élément à l'index " + i + " = " + l.get(i));
//  }
//}

/* 
 * L'objet LinkedList 
 * ==================
 * /


//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
// 
//public class Test {
// 
//  public static void main(String[] args) {
//    List l = new LinkedList();
//    l.add(12);
//    l.add("toto ! !");
//    l.add(12.20f);
//
//    for(int i = 0; i < l.size(); i++)
//      System.out.println("Élément à l'index " + i + " = " + l.get(i));
//
//      System.out.println("\n \tParcours avec un itérateur ");
//      System.out.println("-----------------------------------");
//      ListIterator li = l.listIterator();
//
//      while(li.hasNext())
//        System.out.println(li.next());
//  }
//}


/* 
 * L'objet ArrayList 
 * =================
 */

//import java.util.ArrayList;
// 
//public class Test {
// 
//  public static void main(String[] args) {
//         
//    ArrayList al = new ArrayList();
//    al.add(12);
//    al.add("Une chaîne de caractères !");
//    al.add(12.20f);
//    al.add('d');
//                
//    for(int i = 0; i < al.size(); i++)
//    {
//      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
//    }               
//  }
//}

/* 
 * L'objet Hashtable
 * =================
 */

//import java.util.Enumeration;
//import java.util.Hashtable;
//
//public class Test {
//
//  public static void main(String[] args) {
//
//    Hashtable ht = new Hashtable();
//    ht.put(1, "Frühling");
//    ht.put(10, "Sommer");
//    ht.put(12, "Herbst");
//    ht.put(45, "Winter");
//
//    Enumeration e = ht.elements();
//
//    while(e.hasMoreElements())
//      System.out.println(e.nextElement());
//
//  }
//}

/* 
 * L'objet HashSet
 * =================
 */
import java.util.HashSet;
import java.util.Iterator;
 
public class Test { 
  public static void main(String[] args) {         
    HashSet hs = new HashSet();
    hs.add("toto");
    hs.add(12);
    hs.add('d');

    Iterator it = hs.iterator();
    while(it.hasNext())
      System.out.println(it.next());
 
    System.out.println("\nParcours avec un tableau d'objet");
    System.out.println("-----------------------------------");
                
    Object[] obj = hs.toArray();
    for(Object o : obj)
      System.out.println(o);                
  }
}
