package com.java.certification.questions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayMergeWithStream {

    public static void main(String[] args) {

        //The Stream.of() method of Stream interface returns a sequential ordered stream whose elements are the values.

        //flatMap() method
        //The flatMap() method is the method of Stream interface. It returns a stream consisting of the result.


            Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array
            Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7}; //destination array
            Object[] mergedArray = mergeArray(firstArray,secondArray); //merged array
            System.out.println("Merged array: "+ Arrays.toString(mergedArray));



    }

    public static <T> Object[] mergeArray(T[] arr1, T[] arr2)
    {

       //Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
        Object[] arrayList= Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
        return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
    }
}
