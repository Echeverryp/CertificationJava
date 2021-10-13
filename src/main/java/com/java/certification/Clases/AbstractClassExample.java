package com.java.certification.Clases;

public abstract class AbstractClassExample {

    public static void main(String[] args) {

        AbstractClassExample abstractClassExample = new AbstractClassExample() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }

        };

    }
}
