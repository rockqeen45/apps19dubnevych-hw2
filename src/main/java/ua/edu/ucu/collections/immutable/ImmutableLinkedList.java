package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList {
    private Node head;

    @Override
    public ImmutableLinkedList add(Object e) {
        Node newElem = new Node(e);
        ImmutableLinkedList newList = new ImmutableLinkedList();
        if (isEmpty()) {
            newList.setHead(newElem);
        }
        else {
            Node current = this.getHead();
            newList.setHead(current);
            Node newCurrent = newList.getHead();
            while (current.getNext() != null) {
                current = current.getNext();
                newCurrent.setNext(current);
                newCurrent = newCurrent.getNext();
            }
            newCurrent.setNext(newElem);
        }
        return newList;
    }

    @Override
    public ImmutableLinkedList add(int index, Object e) {
        Node newElem = new Node(e);
        ImmutableLinkedList newList = new ImmutableLinkedList();
        if (isEmpty()) {
            newList.setHead(newElem);
        }
        else {
            Node current = this.getHead();
            newList.setHead(current);
            Node newCurrent = newList.getHead();
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
                newCurrent.setNext(current);
                newCurrent = newCurrent.getNext();
            }
            newCurrent.setNext(newElem);
            newCurrent = newCurrent.getNext();
            while (current.getNext() != null) {
                current = current.getNext();
                newCurrent.setNext(current);
                newCurrent = newCurrent.getNext();
            }
        }
        return newList;
    }

    @Override
    public ImmutableLinkedList addAll(Object[] c) {
        ImmutableLinkedList newList = this.add(c[0]);
        for (int i = 1; i < c.length; i++) {
            newList = newList.add(c[i]);
        }
        return newList;
    }

    @Override
    public ImmutableLinkedList addAll(int index, Object[] c) {
        ImmutableLinkedList newList = this.add(index, c[0]);
        index++;
        for (int i = 1; i < c.length; i++) {
            newList = newList.add(index, c[i]);
            index++;
        }
        return newList;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public ImmutableLinkedList remove(int index) {
        return null;
    }

    @Override
    public ImmutableLinkedList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ImmutableList clear() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public ImmutableLinkedList addFirst(Object e) { // додає елемент у початок зв'язаного списку
        return null;
    }

    public ImmutableLinkedList addLast(Object e) {  // додає елемент у кінець зв'язаного списку
        return (ImmutableLinkedList) this.add(e);
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public ImmutableLinkedList removeFirst() { //видаляє перший елемент
        return null;
    }

    public ImmutableLinkedList removeLast() { // видаляє останній елемент
        return null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
