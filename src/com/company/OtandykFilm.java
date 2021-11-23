package com.company;

public class OtandykFilm implements MediaPlayer{
    private   String name,
    zhanr,
    resiger;
     String year;

    public OtandykFilm(String name, String zhanr, String resiger,String year){
        this.name = name;
        this.zhanr =zhanr;
        this.resiger= resiger;
        this.year =year;
    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void switchMove() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
