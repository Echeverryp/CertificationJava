package com.java.certification.StringTests;

public class PruebasConString {

    public static void main(String[] args) {
        //MINUSCULA
        //a=97,b=98,c=99......
        //MAYSUCULAS
        //A=65,B=66,C=67......
        int numero='b';
        int numeroDos='e';
        System.out.println("NUMERO"+numero);
        System.out.println("NUMERO DOS"+numeroDos);
        System.out.println("NUMERO - NUMERODOS "+ (numero-numeroDos));


        String textoUno="abc";
        String textoDos="aeio";
        String textoTres="hOlA";
        String textoCuatro="Hola ";
        System.out.println(textoUno==textoDos);

        System.out.println(textoUno.equalsIgnoreCase(textoTres));
        System.out.println(textoUno.equalsIgnoreCase(textoCuatro));
        //Resta textoUno con el textoDos
        //En este caso que la palabra no es igual, lo que hace es restrar el valor numerico de
        //la variable con la que empieza a diferenciarse el String
        //en este caso como el string de inmediato es diferente se resta el valor numerico de a (97)
        // con el valor numerico de y (121)
        System.out.println("¨*************** COMPARE TO **********************¨");
        //COMPARE TO
        //EL COMPARE TO CUANDO ENCUENTRA DOS STRINGS QUE SON SIMILARES (EJEMPLO abc y abcd) al encontrar
        //Una diferencia en este caso la d lo que hace es restar el lenght de abc y el e abcd y ese sera
        //el resultado, pero en el caso de que dentro del size de alguno de los lenght se encuentra una
        //diferencia en una letra, restara el valor numerico de esa letra con la otra EJEMPLO
        //(abc, aei) restara el valor numerico de b con el valor numerico de e
        System.out.println(textoUno.length());
        System.out.println( textoDos.length());

        System.out.println("COMPARE TO TEXTO UNO Y TEXTODOS");
        System.out.println(textoUno.compareTo(textoDos));
        System.out.println("COMPARE TO TEXTO UNO Y TRES");
        System.out.println(textoUno.compareTo(textoTres));
        System.out.println("COMPARE TO TEXTO UNO Y CUATRO");
        System.out.println(textoUno.compareTo(textoCuatro));

        //CONTENT EQUALS
        System.out.println("¨*************** CONTENT EQUALS **********************¨");
        String textoUnoContent="abc";
        String textoDosContent="a";
        String textoTresContent="ABCD";
        String textoCuatroContent="abc";

        //The contentEquals() method searches a string to find out if it contains the exact
        // same sequence of characters in the specified string or StringBuffer.
        int letraAMayusc= 'Z';
        System.out.println("LETRA A MAYUSC"+letraAMayusc);
        System.out.println("CONTENT EQUALS TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoContent.contentEquals(textoDosContent));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoContent.contentEquals(textoTresContent));
        System.out.println("CONTENT EQUALS TEXTO UNO Y CUATRO");
        System.out.println(textoUnoContent.contentEquals(textoCuatroContent));


        //IS EMPTY
        String textoUnoEmpty="";
        String textoDosEmpty="A";
        String textoTresEmpty="ABCD";
        System.out.println("¨*************** IS EMPTY **********************¨");
        System.out.println("CONTENT EQUALS TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoEmpty.isEmpty());
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoDosEmpty.isEmpty());
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoTresEmpty.isEmpty());

        //IS BLANK
        //EL BLANK ES SIMILAR AL EMPTY SOLO QUE EL BLANK NO TIENE ENCUENTA LOS ESPACIOS MIENTRAS
        //QUE EL EMPTY SI , YA QUE EL EMPTY VALIDA EL TAMAÑO DEL STRING
        String textoUnoBlank=" ";
        String textoDosBlank="ABC";
        String textoTresBlank="ABCD";
        System.out.println("¨*************** ISBLANK **********************¨");
        System.out.println("CONTENT EQUALS TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoBlank.isBlank());
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoDosBlank.isBlank());
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoTresBlank.isBlank());


        //ENDS WITH

        String textoUnoEndsWith="ABC";
        System.out.println("¨*************** ENDS WITH **********************¨");
        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoEndsWith.endsWith("c"));

        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoEndsWith.endsWith("C"));

        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoEndsWith.endsWith("x"));

        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoEndsWith.endsWith("1"));

        //START WITH

        String textoUnoStartWith="ABC";
        System.out.println("¨*************** ENDS WITH **********************¨");
        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoStartWith.startsWith("A"));

        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoStartWith.startsWith("a"));

        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoStartWith.startsWith("x"));

        System.out.println("ENDS WITH TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoStartWith.startsWith("1"));

        //INDEX OF
        //INDEX OF COGE LA POSICION DE LA LETRA QUE INSERTEMOS , EN CASO DEI INSERTAR POR EJEMPLO
        //bc en un texto que dice abc va a tomar la primera posicion q encuenra osea la de b
        //EN CASO DE NO ENCONTRAR NADA, RETORNARA -1
        String textoUnoIndexOf="abc";
        System.out.println("¨*************** INDEX OF **********************¨");
        System.out.println("CONTENT EQUALS TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoIndexOf.indexOf("a"));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoIndexOf.indexOf("bc"));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoIndexOf.indexOf("abc"));

        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoIndexOf.indexOf("12"));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoIndexOf.indexOf("AB"));

        //LAST INDEX OF
        //REALIA LA BUSQUEDA IGUAL QUE EL INDEX OF PERO EN ESTE CASO TOMA EL ULTIMO
        //CARACTER QUE COINCIDA CON LA BUSQUEDA .. EN CASO DE ABCABC SI BUSCO A
        //TOMARIA EL ULTIMO A , OSEA EL QUE ESTA EN LA POSICION 3
        String textoUnoLastIndexOf="abcabc";
        System.out.println("¨*************** LAST INDEX OF **********************¨");
        System.out.println("CONTENT EQUALS TEXTO UNO Y TEXTODOS");
        System.out.println(textoUnoLastIndexOf.lastIndexOf("a"));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoLastIndexOf.lastIndexOf("bc"));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoLastIndexOf.lastIndexOf("abc"));

        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoLastIndexOf.lastIndexOf("12"));
        System.out.println("CONTENT EQUALS TEXTO UNO Y TRES");
        System.out.println(textoUnoLastIndexOf.lastIndexOf("AB"));


        //MATCHES
        System.out.println("¨*************** MATCHES**********************¨");
        //El método matches de String nos permite comprobar si un String cumple una
        // expresión regular pasado como parámetro. Si es cierta devuelve true, sino false.
        //https://www.discoduroderoer.es/metodo-string-matches-de-java/
        String cadena="Solo se que no se nada";

        // ejemplo1: devolvera false, ya que la cadena tiene mas caracteres
        System.out.println("ejemplo1: "+cadena.matches("Solo"));

        // ejemplo2: devolvera true, siempre y cuando no cambiemos la cadena Solo
        System.out.println("ejemplo2: "+cadena.matches("Solo.*"));

        // ejemplo3: devolvera true, siempre que uno de los caracteres se cumpla
        System.out.println("ejemplo3: "+cadena.matches(".*[qndw].*"));

        // ejemplo3: devolvera false, ya que ninguno de esos caracteres estan
        System.out.println("ejemplo4: "+cadena.matches(".*[xyz].*"));

        // ejemplo4: devolvera true, ya que le indicamos que no incluya esos caracteres
        System.out.println("ejemplo4: "+cadena.matches(".*[^xyz].*"));

        // ejemplo5: devolvera true, si quitamos los caracteres delante de ? del STring original seguira devolviendo true
        System.out.println("ejemplo5: "+cadena.matches("So?lo se qu?e no se na?da"));

        // ejemplo6: devolvera false, ya que tenemos una S mayuscula empieza en el String
        System.out.println("ejemplo6: "+cadena.matches("[a-z].*"));

        // ejemplo7: devolvera true, ya que tenemos una S mayuscula empieza en el String
        System.out.println("ejemplo7: "+cadena.matches("[A-Z].*"));

        String cadena2="abc1234";

        // ejemplo8: devolvera true, ya que minimo debe repetirse alguno de los caracteres al menos una vez
        System.out.println("ejemplo8: "+cadena2.matches("[abc]+.*"));


        // ejemplo9: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico 4 veces
        System.out.println("ejemplo9: "+cadena2.matches("[abc]+\\d{4}"));

        // ejemplo10: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico entre 1 y 10 veces
        System.out.println("ejemplo10: "+cadena2.matches("[abc]+\\d{1,10}"));

        //CONCAT
        System.out.println("¨*************** CONCAT**********************¨");
        String textoConcat="Hola";
        System.out.println(textoConcat.concat("Mundo").concat("Dos"));

        System.out.println(textoConcat.concat("Chao"));

        //JOIN
        //CREA UN STRING EN DONDE EL DELIMITER VA A SER EL VALOR DE ESPACIO ENTRE LOS ELEMENTOS
        //EJEMPLO EL DELIMITER "*" CON LOS ELEMENTOS HOLA MUNDO , DARIA HOLA*MUNDO*
        System.out.println("¨*************** JOIN**********************¨");

        System.out.println(String.join("a","Hola","Mundo","Mundial","No"));

        System.out.println(String.join(" ","Hola","Mundo","NO","No"));

        //REPLACE
        //CAMBIA UNA VARIABLE QUE TENGA EL TARGET POR EL REPLACEMENT
        //Este método Java devuelve una nueva cadena resultante de reemplazar cada aparición de caracteres con un nuevo carácter
        String textoReplace="HOLAOL";

        System.out.println(textoReplace.replace("OL","ab"));
        System.out.println(textoReplace);

        //REPLACEALL
        //El método java string replaceAll () devuelve una cadena que reemplaza toda la secuencia de caracteres que coinciden con la expresión regular y la cadena de reemplazo.
        //CAMBIA UNA VARIABLE QUE TENGA EL TARGET POR EL REPLACEMENT
        String str = "Guru99 is a site providing free tutorials";
        //remove white spaces
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);

        //REPLACE FIRST
        //El método reemplaza la primera subcadena de la cadena dada que coincide con esa expresión regular.

        String strRP = "This website providing free tutorials";
        //Only Replace first 's' with '9'
        String strRP1 = strRP.replaceFirst("s", "9");
        System.out.println(strRP1);


        //SUBSTRING
        //RETORNA UN STRING DESDE 0 OSEA H Y RETORNA HASTA LA POSICION 2 OSEA E, SIN INCLUIR LA E
        //SI NO SE PONE LA PRIMERA POSICION, SE TOMARA COMO QUE ES DESDE LA POSICION COLOCADA HASTA ADELANTE
        String s="hello";
        System.out.println(s.substring(0,2)); //returns he  as a substring

        String s1="SachinTendulkar";
        System.out.println("Original String: " + s1);
        System.out.println("Substring starting from index 6: " +s1.substring(6));//Tendulkar
        System.out.println("Substring starting from index 0 to 6: "+s1.substring(0,6)); //Sachin
    }

}
