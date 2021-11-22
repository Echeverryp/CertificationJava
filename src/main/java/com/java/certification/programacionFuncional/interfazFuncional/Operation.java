package com.java.certification.programacionFuncional.interfazFuncional;

@FunctionalInterface
public interface Operation {

    float operation();

    private void interfacePrivateMethod(){

    }
    static void interfaceStaticMethod(){

    }
    default void interfaceDefaultMethod(){
    operation();
    }


    public static void main(String[] args) {
        /*Operation o1=multiplication();

        Operation o2= ()->o1.operation();
        //Operation o2=o1::operation;
        printResultOfThis(o2);
*/
      //  printResultOfThis(o1);

        Operation operation1=()->3.3f*3;
        Operation operation2=()->3/3f;

        printResultOfThis(operation1);
        printResultOfThis(()->3.3f*3);
    }

    public static Operation multiplication(){
        return new Operation() {
            @Override
            public float operation() {
                var value=3.3f;
                print("Primer valor " + value);
                var value2=3;
                print("Segundo valor " + value2);
                return value*value2;
            }
            private void print (String value){
                System.out.println(value);
            }
        };
    };

    public static void printResultOfThis(Operation operation){
        System.out.println(operation.operation());
    }
}
