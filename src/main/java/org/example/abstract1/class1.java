package org.example.abstract1;
abstract class class2 {
    public void print(){
        System.out.println("-------");
    }
    abstract public void print2();
}
public class class1 extends class2{

    @Override
    public void print2() {
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        class1 c=new class1();
        c.print2();
        c.print();

    }
}
