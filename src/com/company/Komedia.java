package com.company;
import  java.util.HashMap;
public class Komedia extends OtandykFilm{
    public Komedia(String name, String zhanr, String resiger, String year){
        super(name, zhanr, resiger, year);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void switchMove() {
        System.out.println("Film 10 sek jyljydy");
    }

    @Override
    public void play() {
        System.out.println("Film oinaldy");
    }

    @Override
    public void pause() {
        System.out.println("Film pausada tyr");
    }

    @Override
    public void stop() {
        System.out.println("Film toktadi");
    }
}
