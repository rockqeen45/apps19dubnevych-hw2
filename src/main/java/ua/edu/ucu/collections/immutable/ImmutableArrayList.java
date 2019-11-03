package ua.edu.ucu.collections.immutable;


public class ImmutableArrayList implements ImmutableList {
    private Object[] array;

    public ImmutableArrayList() {
        this.array = new Object[0];
    }

    public ImmutableArrayList(Object[] array) {
        this.array = array.clone();
    }

    @Override
    public ImmutableArrayList add(Object e) {
        Object[] arr = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        arr[arr.length - 1] = e;
        return new ImmutableArrayList(arr);
    }

    @Override
    public ImmutableArrayList add(int index, Object e) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] arr = new Object[array.length + 1];
        for (int i = 0; i < index; i++) {
            arr[i] = array[i];
        }
        arr[index] = e;
        for (int i = index; i < array.length; i++) {
            arr[i + 1] = array[i];
        }
        return new ImmutableArrayList(arr);
    }

    @Override
    public ImmutableArrayList addAll(Object[] c) {
        Object[] arr = new Object[array.length + c.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        for (int j = 0; j < c.length; j++) {
            arr[j + array.length] = c[j];
        }
        return new ImmutableArrayList(arr);
    }

    @Override
    public ImmutableArrayList addAll(int index, Object[] c) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] arr = new Object[array.length + c.length];
        for (int i = 0; i < index; i++) {
            arr[i] = array[i];
        }
        for (int j = 0; j < c.length; j++) {
            arr[j + index] = c[j];
        }
        for (int i = index; i < array.length; i++) {
            arr[i + c.length] = array[i];
        }
        return new ImmutableArrayList(arr);
    }


    @Override
    public Object get(int index) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public ImmutableArrayList remove(int index) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] arr = new Object[array.length - 1];
        for (int i = 0; i < index; i++) {
            arr[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            arr[i-1] = array[i];
        }
        return new ImmutableArrayList(arr);
    }

    @Override
    public ImmutableArrayList set(int index, Object e) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] arr = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        arr[index] = e;
        return new ImmutableArrayList(arr);
    }

    @Override
    public int indexOf(Object e) {
        int i = 0;
        try {
            while (array[i] != e) {
                i++;
            }
            return i;
        } catch (IndexOutOfBoundsException ex) {
            return -1;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }
}
