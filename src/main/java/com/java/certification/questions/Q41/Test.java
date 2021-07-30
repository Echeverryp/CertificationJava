package com.java.certification.questions.Q41;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        Locale.setDefault(Locale.FRANCE);
        ResourceBundle msg= ResourceBundle.getBundle("MessagesBundle",new Locale("ru"));
        System.out.println("Usr"+ msg.getString("username"));
        System.out.println("Usr"+ msg.getString("password"));
    }
}
