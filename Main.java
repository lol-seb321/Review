import java.util.ArrayList;
import java.util.LinkedList;
class Main {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<String>();
    names.add("Kyle");
    System.out.println(names);

    ArrayList<String> ArrayListNames = new ArrayList<String>();
    ArrayListNames.add("John");
    ArrayListNames.remove(0);
    System.out.println(ArrayListNames);
    names.add(1, "Robert");
    System.out.println(names.get(1));
    System.out.println(names);
    System.out.println(names.size());
    System.out.println(names.isEmpty());
}
}