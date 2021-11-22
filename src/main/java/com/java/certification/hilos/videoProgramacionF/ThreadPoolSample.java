package com.java.certification.hilos.videoProgramacionF;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadPoolSample {

    private final int numOfThreads;
    private List<Thread> threads;
    private final VolatileOrAtomic volatileOrAtomic;
    private final int rounds;
    private final ConcurrentLinkedDeque<Long> lstOfOperations= new ConcurrentLinkedDeque<>();

    public ThreadPoolSample(int numOfThreads, int rounds, VolatileOrAtomic volatileOrAtomic){
        this.numOfThreads=numOfThreads;
        this.volatileOrAtomic=volatileOrAtomic;
        this.rounds=rounds;

    }
    public ThreadPoolSample createThreadPoolReadAndWrite(){

         threads= IntStream.range(0,numOfThreads).mapToObj(num->new Thread(increment())).collect(Collectors.toUnmodifiableList());
        return this;
    }
    public ThreadPoolSample executeAllThreads(){
        threads.forEach(Thread::start);
        return this;
    }

    public ThreadPoolSample awaitAllExecutor(){
        threads.forEach(this::await);
        return this;
    }

    private Runnable increment() {
        return ()->{
            var round=0;
            while (round<rounds){
                lstOfOperations.add(volatileOrAtomic.count++);
                round++;
            }
        };
    }

    public void await(Thread thread){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public ConcurrentLinkedDeque<Long> getResult() {
        return lstOfOperations;
    }
}
