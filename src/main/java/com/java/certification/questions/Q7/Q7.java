package com.java.certification.questions.Q7;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        //Lost linkedlist pueden repetir los elementos
        List<String> list1=new LinkedList<>();
        //Hashset o set no pueden repetir elementos en la lista (estan desorneados)
        Set<String> hs1=new HashSet<>();

        String[] v={"a","b","c","b","a"};
        for (String s :v){
            list1.add(s);
            hs1.add(s);
        }

        System.out.println(hs1.size()+ " " + list1.size() + " ");
        HashSet hs2= new HashSet(list1);
        LinkedList list2=new LinkedList(hs1);
        System.out.println(hs2.size() + " " + list2.size());
    }


}
