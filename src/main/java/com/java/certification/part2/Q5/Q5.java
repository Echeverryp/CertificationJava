package com.java.certification.part2.Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q5 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(1997,2,7);
        //ee 06 - eee vie. -eeee viernes
        //d 7 - dd 07
        //MM 02 - MMM feb. - MMMM febrero
        //yyyy 1997 - yyy 1997- yy 97
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern("eeee dd 'th of' MM yy");
        System.out.println(dtf.format (d1));

        String[] things = new String[3];
        things[0] = new String("Hat");
        things[1] = new String("Rat");
        things[2] = things[0]; //Hat
        things[0] = new String("Cat");
        things[1] = things[2]; //Hat

        //Friday 7th of February 1997
    }
}
