package com.thinkinginjava.concurrency.lessons;

public class RunnablePerson extends Person implements Runnable {

    public RunnablePerson(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++ ){
            System.out.println(getName() + ":Hi");
        }
    }

    public static void main(String[] args){
        RunnablePerson rp1 = new RunnablePerson("Pavel");
        Thread t1 = new Thread(rp1);
        t1.start();
        RunnablePerson rp2 = new RunnablePerson("Test");
        Thread t2 = new Thread(rp1);
        t2.start();
    }
}
