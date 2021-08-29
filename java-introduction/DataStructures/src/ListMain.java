import java.util.ArrayList;
// import java.util.Collection;

public class ListMain {
  public static void main(String[] args) {
    // System.out.println("John");

    ArrayList<String> arrayList = new ArrayList<String>();
    // Collection arrayLists = new ArrayList();
    arrayList.add("John");
    arrayList.add("Boamah");
    System.out.println(arrayList);

    for (String name: arrayList) {
      System.out.println(name);
    }

    arrayList.remove("John");
    for (int i=0; i<arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
    }

    // LinkedList<String> orders = new LinkedList<>();

}
 