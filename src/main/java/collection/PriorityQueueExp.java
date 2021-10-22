package collection;

import java.util.PriorityQueue;

public class PriorityQueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(40);
        priorityQueue.add(90);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.size());
    }
}
