package AplicacionTDAcola;

import java.util.LinkedList;
import java.util.Queue;

class TurnOrder<T> {
    private final Queue<T> waitingList = new LinkedList<>();

    public void enqueue(T person) {
        waitingList.offer(person);
        System.out.println(person + " has joined the queue.");
    }

    public void serveNext() {
        if (!waitingList.isEmpty()) {
            System.out.println("Now serving: " + waitingList.poll());
        } else {
            System.out.println("The queue is empty.");
        }
    }

    public void displayQueue() {
        if (waitingList.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("Current queue: " + waitingList);
        }
    }
}