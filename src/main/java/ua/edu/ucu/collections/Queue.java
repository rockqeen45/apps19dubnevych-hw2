package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import java.util.LinkedList;

public class Queue {
    private ImmutableLinkedList linkQ;

    public Queue() {
        this.linkQ = new ImmutableLinkedList();
    }

    public Object peek() {
        return linkQ.getFirst();
    }

    public Object dequeue() {
        Object first = linkQ.getFirst();
        linkQ = linkQ.removeFirst();
        return first;
    }

    public void enqueue(Object e) {
        linkQ = linkQ.addLast(e);
    }

}
