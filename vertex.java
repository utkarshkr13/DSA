import java.util.*;

public class vertex {
    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        llist.head.next.next.next.next = llist.head;
        if (detectLoop(head))
            System.out.println("Loop Exists");
        else
            System.out.println("Loop doesn't exists");

    }
    
}
