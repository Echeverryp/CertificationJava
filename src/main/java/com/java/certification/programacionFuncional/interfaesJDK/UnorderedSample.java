package com.java.certification.programacionFuncional.interfaesJDK;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
public class UnorderedSample {


    /*
    En los casos en los que la secuencia tiene un orden de encuentro, pero el usuario
    no le importa particularmente ese orden de encuentro, desordenar explicitamente la secuencia
    con unordered() puede mejorar el rendimiento en paralelo para algunas
    operaciones con estado o de terminal. Por ejemplo cuando filtramos con distinct() o en reducciones
    como GroupingBy
     */

    @Param("500000")
    private long NUMBER;
    private List<Long> lst;
    public static void main(String[] args) throws RunnerException {


        var options= new OptionsBuilder().include(UnorderedSample.class.getSimpleName()).
                forks(1).warmupIterations(3).timeUnit(TimeUnit.MILLISECONDS).measurementIterations(4).build();

        new Runner(options).run();


    }

    @Benchmark
    public  void loadData(){
        lst=new ArrayList<>();
        for(long i=0; i<NUMBER;i++){
            lst.add(i);
        }
        for(long i=0; i<NUMBER;i++){
            lst.add(i);
        }
    }
    @Benchmark
    public Long ordered(){
        return lst.parallelStream().distinct().reduce(0L,Long::sum);
    }

    public Long unordered(){
        return lst.parallelStream().unordered().distinct().reduce(0L,Long::sum);
    }
}
