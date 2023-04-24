package org.example.Inheritance;

public class demo implements test1, test2 {
    @Override
    public void print() {
        System.out.println("---------------");
    }

    @Override
    public void show() {
        System.out.println("-----");
    }

    public static void main(String[] args) {
        demo d = new demo();
        d.print();
        d.show();
    }
}
