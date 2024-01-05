import java.util.NoSuchElementException;
import java.lang.reflect.Array;

public class SimpleLinkedList<T> {
    private Element<T> root = null;
    private Integer size = 0;

    public SimpleLinkedList() { }

    public SimpleLinkedList(T[] values) {
        
        for(T value: values)
            push(value);
    }

   public Integer size() {
       
       return size;
   } 

   public T pop() throws NoSuchElementException {
       
       if(root == null)
           throw new NoSuchElementException();
       T value = root.value;
       root = root.next;
       size--;
       return value;
   }
       
   public void push(T value) {
       
       Element<T> e = new Element<T>();
       e.value = value;
       e.next = root;
       root = e;
       size++;
   }

   public T[] asArray(Class<T> type) {
       
       T[] array = (T[])Array.newInstance(type, size());
       Element<T> e = root;
       for(int i = 0; e != null; e = e.next, i++)
           array[i] = e.value;
       return array;
   }

   public void reverse() {
      
       Element<T> next = root.next;
       Element<T> prev = null;
       root.next = prev;
       while(next != null ) {
           prev = root;
           root = next;
           next = next.next;
           root.next = prev;
       }
    }
}

class Element<T> {
    public T value;
    public Element<T> next;
}