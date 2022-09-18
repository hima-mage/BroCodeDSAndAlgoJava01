/***
 * Queue is FIFO , first come first out -> line of ppl
 * it's used to hold elements for prior processing
 * linear data structure
 * add = enqueue , offer()
 * remove = dequeue , poll()
 * Queue in Java is an interface , we cannot create object out from , so need class that implement that queue
 * LinkList implement that Queue interface
 *
 *
 * Queue usage :
 * 1.keyboard buffers
 * 2.Printer Queue
 * 3.User in LinkedLists , PriorityQueues , Breadth-first Search
 *
 */


import  java.util.Queue;
import  java.util.LinkedList;

public class QueueImplmentation {

    public static void main(String[] args) {

        Queue<String> queue =new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("chad");
        queue.offer("Steve");
        queue.offer("Harlod");

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.contains("Steve"));


    }
}
