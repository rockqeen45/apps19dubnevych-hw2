package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private ImmutableList list;

    @Before
    public void setUp() {
        list = new ImmutableLinkedList();
        Integer[] arr = {1, 2, 4, 3};
        list = list.addAll(arr);
        assertEquals(4, list.size());
    }

    @Test //size is also tested
    public void testAdd() {
        list = list.add(1);
        assertEquals(5, list.size());
        list = list.add(2);
        assertEquals(6, list.size());
        list = list.add(3);
        assertEquals(7, list.size());
    }

    @Test
    public void testAddWithIndex() {
        list = list.add(3, 1);
        assertEquals(5, list.size());
        list = list.add(2, 2);
        assertEquals(6, list.size());
        list = list.add(0, 3);
        assertEquals(7, list.size());
    }

    @Test
    public void testAddAll() {
        Integer[] arr = {5, 6, 4, 3};
        list = list.addAll(arr);
        assertEquals(8, list.size());
    }

    @Test
    public void testAddAllWithIndex() {
        Integer[] arr = {5, 6, 4, 3};
        list = list.addAll(3, arr);
        assertEquals(8, list.size());
        assertEquals(5, list.get(3));
    }


    @Test
    public void testGet() {
        list = list.add(1, 5);
        assertEquals(list.get(1), 5);
        assertEquals(list.get(2), 2);
        list = list.add(0, 6);
        assertEquals(list.get(0), 6);
    }


    @Test
    public void testRemove() {
        list = list.remove(2);
        assertEquals(3, list.size());
        list = list.remove(0);
        assertEquals(2, list.get(0)); // not 1
    }

    @Test
    public void testSet() {
        list = list.add(1, 5);
        assertEquals(list.get(1), 5);
        assertEquals(list.get(2), 2);
        list = list.add(0, 6);
        assertEquals(list.get(0), 6);
    }

    @Test
    public void testIndexOf() {
        assertEquals(list.indexOf(4), 2);
        assertEquals(list.indexOf(100), -1);
    }

    @Test
    public void testClear() { //isEmpty also tested
        list = list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testToArray() {
        Object[] arr = list.toArray();
        assertEquals(arr[0], 1);
        assertEquals(arr[2], 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEdgeCases() {
        list.get(6);
        list.get(-3);

        list.set(6, 7);
        list.set(-3, 4);

        list.remove(6);
        list.remove(-3);

        list.add(6, 4);
        list.add(-3, 5);

        Integer[] a = {1, 2, 3, 4};
        list.addAll(6, a);
        list.addAll(-3, a);
    }

    @Test
    public void testAdditionalMethods() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList();
        Integer[] arr = {1, 2, 4, 3};
        linkedList = linkedList.addAll(arr);
        linkedList = linkedList.addFirst(7);
        assertEquals(linkedList.getFirst(), 7);
        assertEquals(linkedList.size(), 5);
        linkedList = linkedList.removeFirst();
        assertEquals(linkedList.size(), 4);

        linkedList = linkedList.addLast(9);
        assertEquals(linkedList.getLast(), 9);
        assertEquals(linkedList.size(), 5);
        linkedList = linkedList.removeLast();
        assertEquals(linkedList.size(), 4);
    }

}
