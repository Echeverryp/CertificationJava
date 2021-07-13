package com.java.certification.questions.Q19;

public class Q19 {

    //PRRT
    public static void main(String[] args) {
        StringBuffer txt1=new StringBuffer("PPQRRRSTT");
        int i=0;
        a:
        while(i<txt1.length()){
            char x= txt1.charAt(i);
            int j=0;
            i++;
            b:
            while(j<txt1.length()){
                char y=txt1.charAt(j);
                if(i!=j && y==x){
                    txt1.deleteCharAt(j);
                    //LINE 1
                    continue a;
                }
                j++;

            }
        }
        System.out.println(txt1);
    }
}
