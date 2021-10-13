package com.java.certification.questions.ArrayList;

import java.util.Arrays;

public class MergeArraysArrayCopy {
    /*
            There are following ways to merge two arrays:

        Java arraycopy() method
        Without using arraycopy() method
        Java Collections
        Java Stream API
             */
    public static void main(String[] args) {

        /*
        Parameters

source: It is a source array.
source_position: Starting point in the source array.
destination: It is a destination array.
destination_position: Starting position in the destination array.
length: The number of array elements to be copied
         */
        //ARRAY COPY
        /*
        Java arraycopy() is the method of System class which belongs to java.lang package. It copies an
        array from the specified source array to the specified position of the destination array. The number of
        elements copied is equal to the length argument.
         */

        int[] firstArray = {23,45,12,78,4,90,1};        //source array
        int[] secondArray = {77,11,45,88,32,56,3};  //destination array
        int fal = firstArray.length;        //determines length of firstArray
        int sal = secondArray.length;   //determines length of secondArray
        int[] result = new int[fal + sal];  //resultant array of size first array and second array
        System.arraycopy(firstArray, 0, result, 0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);
        System.out.println(Arrays.toString(result));    //prints the resultant array


        //ANOTHER EXAMPLE
        System.out.println("ANOTHER EXAMPLE ");
        int firstArrayd[] = { 11,22,33,44,55,98,76,54,60};
        int secondArrayd[] = {66,77,88,99,22,67,21,90,80,70};
        int source_arrd[], sourcePos, dest_arr[], destPos, len;
        source_arrd = firstArrayd;
        dest_arr = secondArray;
        sourcePos = 2;
        destPos = 4;
        len = 3;
// Print elements of source
        System.out.print("source_array : ");
        for (int i = 0; i < firstArrayd.length; i++){
            System.out.print(firstArrayd[i] + " ");}
        System.out.println("");
        System.out.println("sourcePos : " + sourcePos);
// Print elements of destination
        System.out.print("dest_array : ");
        for (int i = 0; i < secondArrayd.length; i++){
            System.out.print(secondArrayd[i] + " ");}

        System.out.println("");
        System.out.println("destPos : " + destPos);
        System.out.println("len : " + len);
//invoking arraycopy() method
        //source_arrd: arreglo que va a copiar elementos,
        // sourcePos: numero desde donde va a comenzar a copiar elementos,
        //dest_arr: arreglo donde se van a copiar elementos
        //destPos: posicion desde donde se va a copiar los elementos pero en nuestro segundo arreglo que recibe lo del primero
        //len: numero de elementos que va a copiar apartir de la posicion donde se va a copiar elementos

        System.arraycopy(source_arrd, sourcePos, dest_arr,destPos, len);
// Print elements of destination after
        System.out.print("Resultant array : ");
        for (int i = 0; i < secondArrayd.length; i++) {
            System.out.print(secondArrayd[i] + " ");
        }

    }


}


