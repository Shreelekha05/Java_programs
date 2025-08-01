package collections;

import java.util.*;
public class iterate {
public static void main(String[] args) {
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Red");
list_Strings.add("Green");
list_Strings.add("Orange");
list_Strings.add("White");
list_Strings.add("Black");

for (String ele : list_Strings) {
  System.out.println(ele);
  }
}
}