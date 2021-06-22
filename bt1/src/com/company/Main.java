package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> abc = new MyList<>(5);
        abc.add(1, 123);
        abc.add(2, 123);
        abc.add(3, 123);
        abc.add(4, 123);
        System.out.println(abc.get(2));

    }
}
