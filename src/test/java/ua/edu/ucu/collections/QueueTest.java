package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue;

    @Before
    public void setUp() {
        queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
    }
    
    @Test
    public void testPeek() {
        assertEquals(queue.peek(), 1);
    }

    @Test
    public void testDequeue() {
        queue.dequeue();
        assertEquals(queue.peek(), 2);
        queue.dequeue();
        assertEquals(queue.peek(), 3);
        queue.dequeue();
        assertEquals(queue.peek(), 4);
    }

    @Test
    public void testEnqueue() {
        Queue q = new Queue();
        q.enqueue(1);
        assertEquals(q.peek(), 1);
        q.enqueue(2);
        assertEquals(q.peek(), 1);
        q.dequeue();
        assertEquals(q.peek(), 2);
    }
    
}
