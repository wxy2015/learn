package com.example.learn;

import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ReflectDemo reflectDemo = new ReflectDemo("test-demo");
        Field field = ReflectDemo.class.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(reflectDemo));




//        ThreadTest threadTest = new ThreadTest();
//        new Thread(threadTest,"窗口A").start();
//        new Thread(threadTest,"窗口B").start();

        RunableTest runableTest = new RunableTest();
        RunableTest runableTest2 = new RunableTest();
//        new Thread(runableTest,"窗口一").start();
//        new Thread(runableTest,"窗口二").start()   ;
//        new Thread(runableTest,"窗口三").start();

        ExecutorService ec = Executors.newFixedThreadPool(10);
        int n = 1;
        ec.submit(runableTest);
        ec.submit(runableTest2);
        ec.shutdown();
    }
}
