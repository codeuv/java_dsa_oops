package com.codeuv.Car;

public class Car  {
    ABSBrake ab = new ABSBrake();

    void applyBrake(){
        ab.halfBrake();
        ab.applyBrake();
    }

}
