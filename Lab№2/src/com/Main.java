package com;

public class Main {

    public static void main(String[] args) {
    Box b1=new Box();
    Box b2=new Box(9);
    Box b3=new Box(3,6,9);
    System.out.println("First box:");
    b1.ShowBox();
    System.out.println("Second box:");
    b2.ShowBox();
    System.out.println("Third box:");
    b3.ShowBox();
    b3.Area();
    b3.Volume();
    System.out.println("");
    Queue q1=new Queue();
    Queue q2=new Queue(3);
    System.out.println("Unlimited queue:");
        q1.Empty();
        q1.Push(3);
        q1.Push(5);
        q1.ShowQueue();
        System.out.println("");
        q1.Empty();
        q1.Full();
        q1.Push(6);
        q1.ShowQueue();
        System.out.println("");
        q1.Full();
        q1.Pop();
        System.out.println("After the command <pop>:");
        q1.ShowQueue();
        System.out.println("");
        System.out.println("");
        System.out.println("Limited queue:");
        q2.Push(5);
        q2.Push(8);
        q2.ShowQueue();
        System.out.println("");
        q2.Empty();
        q2.Full();
        q2.Push(7);
        q2.ShowQueue();
        System.out.println("");
        q2.Full();
        System.out.println("If queue is full, but I add one element with value (2):");
        q2.Push(2);
        q2.ShowQueue();
        q2.Pop();
        System.out.println("");
        System.out.println("After the command <pop>:");
        q2.ShowQueue();
        System.out.println("");
        q2.Full();


    }
}
