package com.java.certification.StringTests;

public class SwitchEnum {
    enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

    public static void main(String[] args) {

        //NO SE PUEDE CON DOUBLE,LONG,FLOAT ,BOOLEAN O UN OBJETO. ENUM Y STRINGS SI SE PUEDE, INTEGERS
        for (Day d: Day.values()){

            switch (d){
                case FRIDAY:
                case TUESDAY:
                case MONDAY:
                case WEDNESDAY:
                    System.out.println("");
                    break;
            }
        }

        boolean test=false;
        if (test);
            System.out.println(10);
        if(true)
            System.out.println(10);
        byte [] bytes={100,103,104,107,126};

        String caseAssignedValue="";

        start_for:
        for (var i: bytes
             ) {

            switch (i){
                default:
                case 100:
                case 103:
                    break;
                case 107:
                    caseAssignedValue+="oli";
                    break start_for;
                case 108:
                    break;
            }

        }
        end_for:
        System.out.println("Sali" +caseAssignedValue);
    }


}
