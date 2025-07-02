package com.codeuv.Car;

public interface Brake {
    String name = "B R A K E";
    default void applyBrake(){
        System.out.println("APPLY BRAKES");
    }
}
