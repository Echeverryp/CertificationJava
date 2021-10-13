package com.java.certification.part2.Q46Estudiar;

import java.util.ArrayList;
import java.util.List;

public class Q46 {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Hello");
        l.add("World");
        print(l);
    }
    @SuppressWarnings("all")
    public static void print(List<String>... args) {
        for (List<String> str : args) {
            System.out.println(str);
        }
    }

    /*
    https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/SuppressWarnings.html


Below is a list of markers that can be used in the SuppressWarnings annotation:

all - disable all warnings

boxing - disable warnings related to casting to classes and simple types

cast - disable warnings related to type conversion

dep-ann - disable deprecated annotation warnings

deprecation - disable deprecation warnings

fallthrough - disable warnings related to missing breakpoints in select statements

finally - disable warnings related to final locks that do not return control

hiding - disable warnings related to local objects hiding variables

incomplete-switch - disable warnings related to missing elements in selection statements (enum case)

javadoc - disable warnings related to javadoc warnings

nls - disable warnings related to non-nls literal strings

null - disable warnings related to null parsing

rawtypes - disable warnings related to the use of non-parameterized types

resource - disable warnings related to the use of resources of type Closeable

restriction - disable warnings related to the use of deprecated or prohibited resources

serial - disable warnings related to missing serialVersionUID field in serializable class

static-access - disable warnings related to invalid static access operations

static-method - disable warnings related to methods that can be defined with the static modifier

super - disable warnings related to overriding a method without calling the base method

synthetic-access - disable warnings related to non-optimized access from inner classes

sync-override - disable warnings due to lack of synchronization when overriding a synchronized method

unchecked - disable warnings related to unchecked operations

unqualified-field-access - Disable warnings related to unspecified field access operations

unused - disable warnings related to unused and dead code
     */
}
