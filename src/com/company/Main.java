package com.company;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
Komedia av = new Komedia("Toi","Komedia","Satanov","2019");
        System.out.println(av.year);
        av.hashCode();
        av.switchMove();
        av.pause();
        av.stop();
        av.play();
    }
}
