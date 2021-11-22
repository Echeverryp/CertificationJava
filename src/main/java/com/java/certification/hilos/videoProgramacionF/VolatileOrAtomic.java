package com.java.certification.hilos.videoProgramacionF;

public class VolatileOrAtomic {
    /*
     *
     * No usar volatile=>En una operación de modificación en la que una thread lee
     * -actualiza- y asigna el nuevo valor.
     *
     * Java Atomic Types-> tipos mutables simples que proporcionan operaciones
     * básicas thread-safe y atomicas (volatile no) sin tener que bloquear (Bloques
     * o métodos synchronized).
     *
     * Usarlos-> Cuando el bloqueo podría ser un cuello de botella para los thread o
     * haya riesgo de punto muerto o de bloqueo activo.
     *
     */

    public volatile Long count;

    public static void main(String[] args) {
        var volatileOrAtomic=new VolatileOrAtomic();
        int numThreads=10;
        int rounds=100;
        var threadPool =new ThreadPoolSample(numThreads,rounds,volatileOrAtomic).
                createThreadPoolReadAndWrite().
                executeAllThreads().
                awaitAllExecutor().getResult();
    }
}
