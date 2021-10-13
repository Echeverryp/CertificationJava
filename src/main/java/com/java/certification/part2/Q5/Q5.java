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
    }
}
