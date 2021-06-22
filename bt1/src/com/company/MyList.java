package com.company;

import java.util.*;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (index == elements.length) {
            ensureCapa();
            for (int i = 0; i < elements.length; i++) {
                if (i == index) {
                    elements[index] = element;
                    break;
                }
            }
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (i == index) {
                    elements[index] = element;
                    break;
                }
            }
        }
    }

    public E remove(int index) {
        Object temp[] = new Object[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            if (i < index) {
                temp[i] = elements[i];
            } else if (i > index) {
                temp[i] = elements[i + 1];
            } else {
                continue;
            }
        }
        elements = temp;
        return (E) elements;
    }

    public int size() {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum++;
        }
        return sum;
    }

    public E clone() {
        Object temp[];
        temp = elements;
        return (E) temp;
    }

    public int indexOf(E o) {
        int temp = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                temp = i;
            }
        }
        return temp;
    }

    public boolean contains(E o) {
        int temp = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                temp = 1;
            }
        }
        if (temp > 0) return true;
        else return false;
    }

    public E get(int index) {
        if (index >= elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else return (E) elements[index];
    }

    public void clear() {
        Object newElements[] = new Object[DEFAULT_CAPACITY];
        elements = newElements;
    }
}
