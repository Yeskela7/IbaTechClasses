package lesson10_nov04;

public class XLinkedListApp {
  public static void main(String[] args) {
    XLinkedList xl = new XLinkedList();
    xl.add(1);
    xl.add(2);
    xl.add(3);
    xl.add(3);
    xl.add(5);
    xl.add(6);
    xl.add(7);
    System.out.println(xl);
    xl.delete(3);
    System.out.println(xl);
//    boolean found11 = xl.contains(11);
//    boolean found33 = xl.contains(33);
//    boolean found44 = xl.contains(44);
//    System.out.println(found11); // true
//    System.out.println(found33); // true
//    System.out.println(found44); // false
  }
}
