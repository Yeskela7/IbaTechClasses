package lesson10_nov04;

import javax.transaction.xa.Xid;
import java.util.StringJoiner;

public class XLinkedList {

  class XItem {
    int value;
    XItem next;

    public XItem(int value) {
      this.value = value;
    }
  }


  public int length(){
    int length = 0;
    XItem item = head;
    while (item != null){
      item = item.next;
      length++;
    }
    return length;
  }

  public int len(){
    if(head == null) return 0;
    head = head.next;
    return len()+1;
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

  public void rev(){
    XItem cur = head;
    XItem temp = cur.next;
    while (cur.next != null){

      cur = cur.next;

    }
    head = temp;
  }

  public void delete(int value){
    XItem cur = head;
    while(cur.next != null){
      if(cur.next.value == value) {
        cur.next = cur.next.next;
      }else{
        cur = cur.next;
      }
    }
  }

}
