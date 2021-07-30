package com.java.certification.questions.Q40;

import java.util.List;

public class Q40 {

    static class Item{
        public String name;
        public int count;

        public Item(String name,int count){
            this.name=name;
            this.count=count;
        }
    }

    public static void main(String[] args) {
        var items= List.of(new Item("A",10),new Item("B",2),new Item("C",12)
        ,new Item("D",5),new Item("E",6));
        items.stream().filter(i->i.count<0).findFirst();
        items.stream().anyMatch(p->p.count<0);
        items.stream().filter(i->i.count<0).findAny();
    }
}
