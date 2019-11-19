package com.example.learn;

public class ThreadTest extends Thread{

    private int ticket = 10;
    public void run(){
        while (true) {
            System.out.println("Thread ticket = " + Thread.currentThread().getName() + ticket--);
            if (ticket <= 0) {
                break;
            }
        }
    }

}
