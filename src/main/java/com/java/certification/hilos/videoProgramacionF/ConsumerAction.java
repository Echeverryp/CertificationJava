package com.java.certification.hilos.videoProgramacionF;

@FunctionalInterface
public interface ConsumerAction<Consumable>
{

    void consume(Consumable obj);
}