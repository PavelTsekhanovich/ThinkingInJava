package com.thinkinginjava.concurrency.lessons;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.print("Hi");
    }

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
