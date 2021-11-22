package com.java.certification.questions.Q9;

public class PriceChecker <T extends Product>{
    private T product;

    public PriceChecker(T product){
        this.product=product;
    }

    public boolean isPriceEqual(PriceChecker<?> prod){

        return this.product.getPrice() == prod.product.getPrice();
    }

    public static void main(String[] args) {

        PriceChecker<Electronics> a =new PriceChecker<>(new Electronics(100.00));

        PriceChecker<Plushy> b=new PriceChecker<>(new Plushy(1.0));

        System.out.println(a.isPriceEqual(b));
    }
}
