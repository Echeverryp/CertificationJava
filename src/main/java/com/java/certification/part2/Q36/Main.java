package com.java.certification.part2.Q36;

public class Main {

    public static void main(String[] args) {
                    Thread t1 = new Thread(new MyThread());
                    Thread t2 = new Thread(new MyThread());
                    Thread t3 = new Thread(new MyThread());

                    t1.start();
                    t2.run();
                    t3.start();
                    /*
                    The IllegalThreadStateException exception is thrown due to the fact
                    that in line 11 there is an attempt to start the thread t1, which was
                    already started earlier (line 7).
                     */
                }
}
