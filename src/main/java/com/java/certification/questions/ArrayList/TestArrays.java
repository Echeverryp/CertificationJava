package com.java.certification.questions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrays {

    public static void main(String[] args) {


        //INMUTABLE***********************************************
        List<String> testArraysOf= Arrays.asList("a","b","c");
        //testArraysOf.add("d");
        //testArraysOf.stream().forEach(System.out::print);
        //System.out.println("***1");
        //////
        String[] test={"a","b","c","d"};
        String[] testCopyOf= Arrays.copyOf(test,2);

        //Inmutable
        List<String> testListOf= List.of("a","b","c");
        //testListOf.add("d");

        //System.out.println("hola mundo");


        //////////////////EQUALS***********************************************

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("JavaFx");
        list1.add("Java");
        list1.add("WebGL");
        list1.add("OpenCV");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("JavaFx");
        list2.add("Java");
        list2.add("WebGL");
        list2.add("OpenCV");
        System.out.println(list2);
        System.out.println(list2.hashCode());
        System.out.println(list1.hashCode());
        System.out.println(list1.equals(list2));

        //REMOVE ALL***********************************************
        //Java removeAll() method of ArrayList class is used to remove all elements from the list that
        // are contained in the specified collection
        //BORRA LOS ELEMENTOS DE UNA LISTA QUE ESTEN EN OTRA LISTA
        ArrayList<String> firstList=new ArrayList<String>();
//adds elements to the array list
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Peach");
//second array list
        ArrayList<String> secondList=new ArrayList<String>();
//adds elements to the array list
        secondList.add("Apple");
        secondList.add("Pears");
        secondList.add("Papaya");
        secondList.add("Peach");
//removes all elements from the first list
//returns empty list if all the elements of first list match with elements of second list
        secondList.removeAll(firstList);
//prints the element of second list which does not match with the element of the first list
        System.out.println(secondList);

        //RETAIN ALL***********************************************
        //Java retainAll() method of ArrayList class retains only the elements of the list that
        // are contained in other list also


        ArrayList<String> firstListR=new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));
        System.out.println("First arraylist: ");
        System.out.println(firstListR);
//second arraylist
        List<String> secondListR=new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));
        System.out.println("Second arraylist: ");
        System.out.println(secondListR);

//returns the common elements in both list
        secondListR.retainAll(firstListR);
        System.out.println("Common elements in both list: ");
        System.out.println(secondListR);


        //CONTAINS***********************************************
        //Java ArrayList.contains() method is used for comparing two elements of different ArrayList.
        // Java ArrayList.contains() method overrides the contains() method of AbstrarctCollection<E> class.

        //first arraylist
        ArrayList<String> firstListC= new ArrayList<String>(Arrays.asList("Good", "Morning", "Students"));
//second arraylist
        ArrayList<String> secondListC= new ArrayList<String>(Arrays.asList("Good", "Night", "frineds"));
//storing the comparison output in thirdList
        ArrayList<String> thirdListC= new ArrayList<String>();
//iterator using for-each loop
        for(String tempList : firstListC)    //tempList is  a variable
            thirdListC.add(secondListC.contains(tempList) ? "Yes" : "No");
        System.out.println(thirdListC);


        //CONTENT EQUALS *************************************************

    //Java contentEquals() method compares the String with the StringBuffer and returns a boolean value.
        // It belongs to String class.

        ArrayList<String> firstListCC = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        ArrayList<String> secondListCC = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        System.out.println("When Lists are same: "+compareList(firstListCC, secondListCC));
//adding another element to the secondList
        secondList.add("C++");
//output after adding different element
        System.out.println("When Lists are not same: "+compareList(firstListCC, secondListCC));


        //JAVA STREAM *************************************************
        //Java Stream is an interface. It belong to java.util package. It provides a filter() method to filter stream elements on the basis of given elements. It is an intermediate process.

        ArrayList<String> firstListSC  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        System.out.println("First List: "+firstList);
        ArrayList<String> secondListSC = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));
        System.out.println("Second List: "+secondList);
// Finds common elements
        System.out.print("Common elements: " +firstListSC.stream().filter(secondListSC::contains).collect(Collectors.toList()));



        //DEEP EQUALS
        int inarr1[] = {1, 2, 3 };
        int inarr2[] = {1, 2, 3};
        Object[] arr1 = {inarr1};  // arr1 contains only one element
        Object[] arr2 = {inarr2};  // arr2 also contains only one element

        System.out.println("oli " + inarr1.hashCode());
        System.out.println("oli "+inarr2.hashCode());
        System.out.println("oli "+arr1.hashCode());
        System.out.println("oli "+arr2.hashCode());
        if (Arrays.equals(arr1, arr2)){
            System.out.println("Same");}
        else{
            System.out.println("Not same");}

        if (Arrays.deepEquals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");


    }

    public static boolean compareList(ArrayList ls1, ArrayList ls2)
    {
//converts List into String and checks string are equal or not
        return ls1.toString().contentEquals(ls2.toString())?true:false;
    }
}
