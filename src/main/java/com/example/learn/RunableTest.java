package com.example.learn;

import java.io.IOException;
import java.nio.CharBuffer;

public class RunableTest implements Runnable,Readable {

    private int ticket = 100;

    @Override
    public synchronized void run() {
        while(ticket > 0){
            try {
                Thread.sleep(3000L);
                System.out.println("Thread ticket = " + Thread.currentThread().getName() + ticket--);
                if(ticket <= 0){
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
