package com.company;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head; // craft temp = head
        Node holder; // craft noi lu dia chi node tiep theo
        if (head == null) System.out.println("null");
        else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(e);
        temp.next = node;
        numNodes++;
    }
    public Boolean remove(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
            if (temp.getData() == e) {
                break;
            }
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            numNodes--;
            return true;
        } else return false;
    }
}
