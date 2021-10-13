package com.java.certification.questions.Q42;

import java.util.List;

public class Q42 {

        public static void main(String[] args) {
            var lst = List.of(1, 2.0f, "4.0");
            for (var c : lst) {
                System.out.println("> " + c);
            }
            System.out.println();
            //Cuando es list of no se pueden agregar mas elementos
            lst.add("");
            lst.add(2, 3);                                //line n1
            for (int c = 0; c < lst.size(); c++) {
               //display(lst.get(c));
            }
        }

        //NO SE PUEDE PONER UN VAR EN UN PARAMETRO
      /*  public static void display (var c){

        }
*/

    }

