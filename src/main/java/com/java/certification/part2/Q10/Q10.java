package com.java.certification.part2.Q10;

enum Letter{

    ALPHA(100), BETA(200), GAMMA(300);
        int v;
        Letter (int v) { this.v = v; }
        /* Insert code here */

        public String toString(){
            return String.valueOf(v);
        }
    public static void main(String[] args) {
       System.out.println( Letter.values()[1]);
    }
}
