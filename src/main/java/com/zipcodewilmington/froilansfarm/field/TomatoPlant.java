package com.zipcodewilmington.froilansfarm.field;


public class TomatoPlant extends Crop{

    Tomato tomato;

    public TomatoPlant(){
        tomato = new Tomato();
    }


    public Tomato yield() {
        return tomato;
    }
}

