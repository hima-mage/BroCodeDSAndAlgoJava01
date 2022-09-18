/***
 *  Priority Queue = FIFO
 *  serve elements with highest priority first
 *  before element with lowest priority
 */

import  java.util.*;

public class PriorityQueueImplmentation {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("C");
        queue.offer("B");
        queue.offer("D");
        queue.offer("F");


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
