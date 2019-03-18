import java.util.*;

public class sort {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("JavaFx");
      list.add("Java");
      list.add("WebGL");
      list.add("OpenCV");
      Collections.sort(list);
      System.out.println(list);
      Collections.reverse(list);
      System.out.println(list);
      
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      list1.add(1);
      list1.add(5);
      list1.add(11);
      list1.add(37);
      Collections.sort(list1);
      System.out.println(list1);
      Collections.reverse(list1);
      System.out.println(list1);
   }
}