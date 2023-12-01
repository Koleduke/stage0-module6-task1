package com.epam.mjc.stage0;

public class Animal {
    private  String color;
    private int numberOfPaws;
    private  boolean hasFur;

    public Animal(String color,int numberOfPaws,boolean hasFur) {
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }

    public Animal() {
        super();
    }


    public String getDescription(){
        String fur =" no ";
        if (hasFur){fur=" a ";}
        if(numberOfPaws==1){
            return "This animal is mostly " +color+". It has "+numberOfPaws+" paw and"+fur+"fur.";
        }
    return "This animal is mostly " +color+". It has "+numberOfPaws+" paws and"+fur+"fur.";
    }

}
