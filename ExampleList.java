package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExampleList {
   
   public static void main (String[] args) {

      ArrayList<String> arrayList = new ArrayList<>();
    
      LinkedList<Integer> linkedList = new LinkedList<>();

      arrayList.add("Hi");
      arrayList.add("Good Bye");
      arrayList.add("Merci");
      arrayList.add("Hola");
      
      linkedList.add(5);
      linkedList.add(42);
      linkedList.add(120);
      linkedList.add(66);
      
      doStuffArrayList("ArrayList", arrayList);
      doStuffLinkedList("LinkedList", linkedList);
   }

    private static void doStuffArrayList(String vaule, ArrayList<String> arrayList0) {
        
        arrayList0.forEach((list1) -> {
            System.out.println(list1);
       });
       System.out.println();
    }

    private static void doStuffLinkedList(String linkedList, LinkedList<Integer> linkedList0) {
        linkedList0.forEach((list2) -> {
            System.out.println(list2);
       });
    }
}