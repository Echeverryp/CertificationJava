package codewars;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeWars {

    /*public static String toCamelCase(String s){

        String finalText = "";

        if(s.contains("-")){


            String[] arregloSplit= s.split("-");

            int i=0;
            for (String arreglo: arregloSplit) {
                if(i==0){
                    finalText+=arreglo;
                }
                else{finalText+=arreglo.substring(0,1).toUpperCase() +arreglo.substring(1);}
                i++;
            }
            return finalText;
        }
        if(s.contains("_")){
            String[] arregloSplit= s.split("_");
            int i=0;
            for (String arreglo: arregloSplit) {
                if(i==0){
                    finalText+=arreglo;
                }
                else{finalText+=arreglo.substring(0,1).toUpperCase() +arreglo.substring(1);}
                i++;
            }
            return finalText;
        }


        return s;
    }
*/
    static String toCamelCase(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    static String toCamelCase2(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
    public static void main(String[] args) {
        toCamelCase("the-stealth-warrior");
    }
}
