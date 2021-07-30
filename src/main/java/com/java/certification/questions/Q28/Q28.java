package com.java.certification.questions.Q28;

import java.util.concurrent.locks.ReentrantLock;

public class Q28 {

    private final ReentrantLock lock=new ReentrantLock();
    private Thread.State state;

    public void foo() throws Exception{
        try{
            lock.lock();

        }
        finally {
            lock.unlock();
        }
    }
}
