package ejercicio.java.desafio4;

public class CollectionCustom<T> {
    private T[] array;
    private int size;

    public CollectionCustom(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T item) {
        if (size == array.length) {
            expandArray();
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = item;
        size++;
    }

    public void addLast(T item) {
        if (size == array.length) {
            expandArray();
        }
        array[size] = item;
        size++;
    }

    public void add(T item) {
        addLast(item);
    }

    public T remove(T item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                T removedItem = array[i];
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                return removedItem;
            }
        }
        return null;
    }

    public void removeAll(T item) {
        int i = 0;
        while (i < size) {
            if (array[i].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
            } else {
                i++;
            }
        }
    }

    public boolean empty() {
        return size == 0;
    }

    private void expandArray() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
