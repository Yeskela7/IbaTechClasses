package lesson10_nov04;

import java.util.StringJoiner;

public class XLinkedList {

  class XItem {
    int value;
    XItem next;

    public XItem(int value) {
      this.value = value;
    }
  }

  private XItem head;

  public void add(int value) {
    XItem item = new XItem(value);
    if (head == null) {
      head = item;
    } else {
      XItem current = head;

      while (current.next != null) {
        current = current.next;
      }
      current.next = item;
    }
  }

  public boolean contains(int value) {
    XItem cur = head;
    while (cur != null){
      if(cur.value == value) return true;
      cur = cur.next;
    }
    return false;
  }

  public String toString() {
    StringJoiner sj = new StringJoiner(",");
    XItem cur = head;
    while (cur != null){
      sj.add(String.valueOf(cur.value));
      cur = cur.next;
    }
    return sj.toString();
  }

  public void delete(int value){
    XItem cur = head;
    XItem xItem;
    
//     XItem prev = cur;
//     prev.next = cur.next;
//     cur = null;
    
    xItem = cur.next.next;
    while(cur != null){
      if(cur.next.value == value) {
        cur.next = xItem;
      }else {
        cur = cur.next;
      }
    }
  }

}
